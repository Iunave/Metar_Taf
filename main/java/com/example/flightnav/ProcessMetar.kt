package com.example.flightnav

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.IndexOutOfBoundsException

private val NA = "N/A"

class MetarReport
{
    var raw_text                      = NA
    var station_id                    = NA
    var observation_time              = NA
    var latitude                      = NA
    var longitude                     = NA
    var temp_c                        = NA
    var dewpoint_c                    = NA
    var wind_dir_degrees              = NA
    var wind_speed_kt                 = NA
    var wind_gust_kt                  = NA
    var visibility_statute_mi         = NA
    var altim_in_hg                   = NA
    var sea_level_pressure_mb         = NA
    var corrected                     = NA
    var auto                          = NA
    var auto_station                  = NA
    var maintenance_indicator_on      = NA
    var no_signal                     = NA
    var lightning_sensor_off          = NA
    var freezing_rain_sensor_off      = NA
    var present_weather_sensor_off    = NA
    var wx_string                     = NA
    var sky_cover0                    = NA
    var cloud_base_ft_agl0            = NA
    var sky_cover1                    = NA
    var cloud_base_ft_agl1            = NA
    var sky_cover2                    = NA
    var cloud_base_ft_agl2            = NA
    var sky_cover3                    = NA
    var cloud_base_ft_agl3            = NA
    var flight_category               = NA
    var three_hr_pressure_tendency_mb = NA
    var maxT_c                        = NA
    var minT_c                        = NA
    var maxT24hr_c                    = NA
    var minT24hr_c                    = NA
    var precip_in                     = NA
    var pcp3hr_in                     = NA
    var pcp6hr_in                     = NA
    var pcp24hr_in                    = NA
    var snow_in                       = NA
    var vert_vis_ft                   = NA
    var metar_type                    = NA
    var elevation_m                   = NA

    fun stationICAO(): String?
    {
        if(raw_text.isEmpty())
        {
            return null
        }

        return raw_text.substringBefore(' ').trim()
    }
}


fun MetarReport.setField(field: Int, string: String)
{
    when(field)
    {
        0  -> raw_text                      = string
        1  -> station_id                    = string
        2  -> observation_time              = string
        3  -> latitude                      = string
        4  -> longitude                     = string
        5  -> temp_c                        = string
        6  -> dewpoint_c                    = string
        7  -> wind_dir_degrees              = string
        8  -> wind_speed_kt                 = string
        9  -> wind_gust_kt                  = string
        10 -> visibility_statute_mi         = string
        11 -> altim_in_hg                   = string
        12 -> sea_level_pressure_mb         = string
        13 -> corrected                     = string
        14 -> auto                          = string
        15 -> auto_station                  = string
        16 -> maintenance_indicator_on      = string
        17 -> no_signal                     = string
        18 -> lightning_sensor_off          = string
        19 -> freezing_rain_sensor_off      = string
        20 -> present_weather_sensor_off    = string
        21 -> wx_string                     = string
        22 -> sky_cover0                    = string
        23 -> cloud_base_ft_agl0            = string
        24 -> sky_cover1                    = string
        25 -> cloud_base_ft_agl1            = string
        26 -> sky_cover2                    = string
        27 -> cloud_base_ft_agl2            = string
        28 -> sky_cover3                    = string
        29 -> cloud_base_ft_agl3            = string
        30 -> flight_category               = string
        31 -> three_hr_pressure_tendency_mb = string
        32 -> maxT_c                        = string
        33 -> minT_c                        = string
        34 -> maxT24hr_c                    = string
        35 -> minT24hr_c                    = string
        36 -> precip_in                     = string
        37 -> pcp3hr_in                     = string
        38 -> pcp6hr_in                     = string
        39 -> pcp24hr_in                    = string
        40 -> snow_in                       = string
        41 -> vert_vis_ft                   = string
        42 -> metar_type                    = string
        43 -> elevation_m                   = string
        else -> throw IndexOutOfBoundsException()
    }
}

fun MetarReport.getField(field: Int): String
{
    return when (field)
    {
        0  -> "raw text = $raw_text"
        1  -> "station id = $station_id"
        2  -> "observation time = $observation_time"
        3  -> "latitude = $latitude"
        4  -> "longitude = $longitude"
        5  -> "temp c = $temp_c"
        6  -> "dewpoint c = $dewpoint_c"
        7  -> "wind dir degrees = $wind_dir_degrees"
        8  -> "wind speed kt = $wind_speed_kt"
        9  -> "wind gust kt = $wind_gust_kt"
        10 -> "visibility statute mi = $visibility_statute_mi"
        11 -> "altim in hg = $altim_in_hg"
        12 -> "sea level pressure mb = $sea_level_pressure_mb"
        13 -> "corrected = $corrected"
        14 -> "auto = $auto"
        15 -> "auto station = $auto_station"
        16 -> "maintenance indicator on = $maintenance_indicator_on"
        17 -> "no signal = $no_signal"
        18 -> "lightning sensor off = $lightning_sensor_off"
        19 -> "freezing rain sensor off = $freezing_rain_sensor_off"
        20 -> "present weather sensor off = $present_weather_sensor_off"
        21 -> "wx string = $wx_string"
        22 -> "sky cover0 = $sky_cover0"
        23 -> "cloud base ft agl0 = $cloud_base_ft_agl0"
        24 -> "sky cover1 = $sky_cover1"
        25 -> "cloud base ft agl1 = $cloud_base_ft_agl1"
        26 -> "sky cover2 = $sky_cover2"
        27 -> "cloud base ft agl2 = $cloud_base_ft_agl2"
        28 -> "sky cover3 = $sky_cover3"
        29 -> "cloud base ft agl3 = $cloud_base_ft_agl3"
        30 -> "flight category = $flight_category"
        31 -> "three hr pressure tendency mb = $three_hr_pressure_tendency_mb"
        32 -> "maxT c = $maxT_c"
        33 -> "minT c = $minT_c"
        34 -> "maxT24hr c = $maxT24hr_c"
        35 -> "minT24hr c = $minT24hr_c"
        36 -> "precip in = $precip_in"
        37 -> "pcp3hr in = $pcp3hr_in"
        38 -> "pcp6hr in = $pcp6hr_in"
        39 -> "pcp24hr in = $pcp24hr_in"
        40 -> "snow in = $snow_in"
        41 -> "vert vis ft = $vert_vis_ft"
        42 -> "metar type = $metar_type"
        43 -> "elevation m = $elevation_m"
        else -> throw IndexOutOfBoundsException()
    }
}

fun fillMetarReport(report: String): MetarReport
{
    var parsed = MetarReport()

    if(report.isEmpty())
    {
        return parsed
    }

    val items = if(report.first() == '\"')
    {
        val rawTextEnd = report.indexOfLast { it == '\"' }
        val rawText = report.substring(startIndex = 1, endIndex = rawTextEnd)
        val csvText = report.substring(startIndex = rawTextEnd + 2, endIndex = report.length)
        val csvTextSplit = csvText.split(',')
        listOf(rawText) + csvTextSplit
    }
    else
    {
        report.split(',')
    }

    for(index in items.indices)
    {
        if(items[index].isNotEmpty())
        {
            parsed.setField(field = index, string = items[index])
        }
    }

    return parsed
}


private fun getRawString(report: String): String
{
    if(report.isEmpty())
    {
        return ""
    }
    else if(report.first() == '\"')
    {
        val rawTextEnd = report.indexOfLast { it == '\"' }
        return report.substring(startIndex = 1, endIndex = rawTextEnd)
    }
    else
    {
        return report.substringBefore(',')
    }
}

fun buildMetarReports(reports: List<String>): MutableList<MetarReport>
{
    return MutableList(size = reports.size)
    {
        fillMetarReport(report = reports[it])
        /*
        val rawString = getRawString(report = reports[it])
        MetarReport(text = rawString)
         */
    }
}