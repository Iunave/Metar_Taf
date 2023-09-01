package com.example.flightnav

import android.Manifest
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.location.Location
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.text.TextStyle
import androidx.core.content.ContextCompat
import com.example.flightnav.ui.theme.AppTheme
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority
import com.google.android.gms.tasks.CancellationTokenSource
import kotlinx.coroutines.launch
import com.example.flightnav.network.WebserverAPI
import java.lang.Exception
import kotlin.math.abs
import kotlin.math.min
import java.util.zip.GZIPInputStream

class MainActivity : ComponentActivity()
{
    external fun icao2name(icao: String): String
    external fun decode_metar(metar: String): String

    companion object
    {
        init {
            System.loadLibrary("nativeflightnav")
        }

        lateinit var instance: MainActivity
    }

    lateinit var requestPermissionLauncher: ActivityResultLauncher<String>
    lateinit var fusedLocationClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        instance = this
        actionBar?.hide()

        requestPermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()){}
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

        setContent()
        {
            AppTheme()
            {
                Application()
            }
        }
    }

    override fun onResume()
    {
        super.onResume()
        actionBar?.hide()
    }

    fun hasPermission(permission: String) : Boolean
    {
        val result = ContextCompat.checkSelfPermission(applicationContext, permission)
        return result == PackageManager.PERMISSION_GRANTED
    }

    fun requestPermission(permission: String)
    {
        if(!hasPermission(permission = permission))
        {
           requestPermissionLauncher.launch(permission)
        }
    }

    fun getCurrentLocation(callback: (Location?) -> Unit)
    {
        if(!hasPermission(Manifest.permission.ACCESS_FINE_LOCATION))
        {
            callback(null)
            return
        }

        fusedLocationClient.getCurrentLocation(Priority.PRIORITY_HIGH_ACCURACY, CancellationTokenSource().token)
            .addOnSuccessListener(callback)
    }
}

fun ungzip(data: ByteArray): ByteArray
{
    return GZIPInputStream(data.inputStream()).use { it.readBytes() }
}

enum class InformationType
{
    METAR, TAF
}

suspend fun retreiveWebserverData(type: InformationType): String
{
    MainActivity.instance.requestPermission(Manifest.permission.INTERNET)

    val response = when(type)
    {
        InformationType.METAR -> WebserverAPI.retrofitService.getMETARs()
        InformationType.TAF -> WebserverAPI.retrofitService.getTAFs()
    }

    val ungzipped = ungzip(data = response.bytes())
    return ungzipped.decodeToString()
}

data class WeatherReport(var metar: MetarReport, var taf: TafReport?)

fun combineMetarAndTaf(metars: List<MetarReport>, tafs: List<TafReport>): MutableList<WeatherReport>
{
    val list = emptyList<WeatherReport>().toMutableList()

    for(metar in metars)
    {
        list.add(WeatherReport(metar = metar, taf = null))

        for(taf in tafs)
        {
            if(metar.station_id == taf.station_id)
            {
                list.last().taf = taf
                break
            }
        }
    }

    return list
}

fun SortByID(list: List<WeatherReport>, icao: String): List<WeatherReport>
{
    var mutableList = list.toMutableList()

    mutableList.removeAll()
    {
        !it.metar.station_id.contains(icao)
    }

    val stationComparator =
    {
        lhs: WeatherReport, rhs: WeatherReport ->
        lhs.metar.station_id.compareTo(rhs.metar.station_id)
    }

    return mutableList.sortedWith(comparator = stationComparator)
}

fun SortByLocation(list: List<WeatherReport>, location: Location): List<WeatherReport>
{
    val stationSelector =
    {
        station: WeatherReport -> Float
        val stationLongitude = station.metar.longitude.toFloatOrNull()?:Float.MAX_VALUE
        val stationLatitude = station.metar.latitude.toFloatOrNull()?:Float.MAX_VALUE
        abs(stationLongitude - location.longitude) + abs(stationLatitude - location.latitude)
    }

    return list.sortedBy(selector = stationSelector)
}

suspend fun SortReports(reports: List<WeatherReport>, location: Location?, icao: String): List<WeatherReport>
{
    var result = reports

    result = SortByID(result, icao)

    if(location != null)
    {
        result = SortByLocation(result, location)
    }

    return result
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReportCard(report: WeatherReport)
{
    var isExpanded by remember { mutableStateOf(false) }
    val icao = report.metar.station_id

    val titleText = if(LocalInspectionMode.current)
    {
        val stationName = "inspection mode placeholder"
        "$icao - $stationName"
    }
    else
    {
        val stationName = MainActivity.instance.icao2name(icao)
        "$icao - $stationName"
    }

    val titleStyle = if(LocalInspectionMode.current)
    {
        LocalTextStyle.current
    }
    else if(isExpanded)
    {
        MaterialTheme.typography.displayMedium
    }
    else
    {
        MaterialTheme.typography.displaySmall
    }

    val titleColor = MaterialTheme.colorScheme.surface

    Column(modifier = Modifier
        .clickable { isExpanded = !isExpanded }
        .fillMaxWidth()
        .padding(vertical = 4.dp))
    {
        Text(text = titleText, color = titleColor, softWrap = isExpanded, style = titleStyle)

        if(isExpanded || LocalInspectionMode.current)
        {
            val reportText = "METAR ${report.metar.raw_text}\n${report.taf?.raw_text?:"TAF not available"}"
            val reportColor = MaterialTheme.colorScheme.primary

            Text(
                text = reportText,
                color = reportColor,
                softWrap = true,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 6.dp)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Application()
{
    val scope = rememberCoroutineScope()

    var sortByLocation by rememberSaveable { mutableStateOf(false) }
    var searchID by rememberSaveable { mutableStateOf("") }

    var location: Location? by remember { mutableStateOf(null) }
    var weatherReports by remember { mutableStateOf(emptyList<WeatherReport>()) }
    var sortedWeatherReports by remember { mutableStateOf(emptyList<WeatherReport>()) }

    var metarInfo by remember{ mutableStateOf("") }
    var isValidMetar by remember{ mutableStateOf(false) }
    var tafInfo by remember{ mutableStateOf("") }
    var isValidTaf by remember{ mutableStateOf(false) }

    if(!isValidMetar)
    {
        LaunchedEffect(key1 = null, block =
        {
            try
            {
                metarInfo = retreiveWebserverData(InformationType.METAR)
                isValidMetar = true
            }
            catch(exception: Exception)
            {
                metarInfo = exception.toString()
                isValidMetar = false
            }
        })
    }

    if(!isValidTaf)
    {
        LaunchedEffect(key1 = null, block =
        {
            try
            {
                tafInfo = retreiveWebserverData(InformationType.TAF)
                isValidTaf = true
            }
            catch(exception: Exception)
            {
                tafInfo = exception.toString()
                isValidTaf = false
            }
        })
    }

    LaunchedEffect(key1 = isValidMetar, key2 = isValidTaf, block =
    {
        if(isValidMetar && isValidTaf)
        {
            val metarLines = metarInfo.split('\n')
            val metarReports = buildMetarReports(reports = metarLines.subList(6, metarLines.size))

            val tafLines = tafInfo.split('\n')
            val tafReports = buildTafReports(reports = tafLines.subList(6, tafLines.size))

            weatherReports = combineMetarAndTaf(metars = metarReports, tafs = tafReports)
            sortedWeatherReports = SortReports(weatherReports, location, searchID)
        }
        else
        {
            weatherReports = emptyList()
            sortedWeatherReports = emptyList()
        }
    })

    Column(modifier = Modifier.padding(4.dp))
    {
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(46.dp),
            verticalAlignment = Alignment.CenterVertically)
        {
            Switch(checked = sortByLocation, onCheckedChange =
            {
                sortByLocation = !sortByLocation

                if(sortByLocation)
                {
                    MainActivity.instance.requestPermission(Manifest.permission.ACCESS_FINE_LOCATION)

                    MainActivity.instance.getCurrentLocation()
                    {
                        fetchedLocation ->

                        scope.launch()
                        {
                            location = fetchedLocation
                            sortedWeatherReports = SortReports(weatherReports, location, searchID)
                        }
                    }
                }
                else
                {
                    scope.launch()
                    {
                        sortedWeatherReports = SortReports(weatherReports, null, searchID)
                    }
                }
            })

            Text(text = "location", color = MaterialTheme.colorScheme.background, modifier = Modifier.padding(horizontal = 16.dp))
        }

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            value = searchID,
            onValueChange =
            {
                newString ->

                scope.launch()
                {
                    searchID = newString.uppercase().substring(0, min(4, newString.length))
                    sortedWeatherReports = SortReports(weatherReports, if(sortByLocation) location else null, searchID)
                }
            },
            label = { Text("station ID", color = MaterialTheme.colorScheme.background) },
            maxLines = 1,
            textStyle = TextStyle(color = MaterialTheme.colorScheme.background)
        )

        LazyColumn(modifier = Modifier.wrapContentSize(Alignment.TopStart))
        {
            items(sortedWeatherReports)
            {
                ReportCard(report = it)
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES, name = "dark preview")
@Composable
fun ApplicationPreview_Dark()
{
    AppTheme()
    {
        Application()
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO, name = "light preview")
@Composable
fun ApplicationPreview_Light()
{
    AppTheme()
    {
        Application()
    }
}