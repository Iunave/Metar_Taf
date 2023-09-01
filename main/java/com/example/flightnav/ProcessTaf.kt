package com.example.flightnav

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.IndexOutOfBoundsException

private val NA = "N/A"

class TafReport
{
    var raw_text = NA
    var station_id = NA
}

fun TafReport.setField(field: Int, string: String)
{
    when(field)
    {
        0  -> raw_text                      = string
        1  -> station_id                    = string
        else -> throw IndexOutOfBoundsException()
    }
}

fun TafReport.getField(field: Int): String
{
    return when (field)
    {
        0  -> "raw text = $raw_text"
        1  -> "station id = $station_id"
        else -> throw IndexOutOfBoundsException()
    }
}

fun fillTafReport(report: String): TafReport
{
    var parsed = TafReport()

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
        if(index > 1) break

        if(items[index].isNotEmpty())
        {
            parsed.setField(field = index, string = items[index])
        }
    }

    return parsed
}
/*
class TafReport(var text: String = NA)
{
    fun stationICAO(): String?
    {
        if(text.isEmpty())
        {
            return null
        }

        var word = 0
        for(idx in text.indices)
        {
            if(text[idx] == ' ')
            {
                ++word
            }

            if(word >= 1)
            {
                val wordEnd = text.substring(startIndex = idx + 1).indexOf(' ')

                if(wordEnd - idx == 4) //its the station name
                {
                    return text.substring(startIndex = idx + 1, endIndex = wordEnd)
                }
            }
        }

        return null
    }

    fun decode(): String?
    {
        return null
    }
}
*/

private fun getRawString(report: String): String
{
    return report.substringBefore(',')
}

fun buildTafReports(reports: List<String>): MutableList<TafReport>
{
    return MutableList(size = reports.size)
    {
        fillTafReport(report = reports[it])
        /*
        val rawString = getRawString(report = reports[it])
        TafReport(text = rawString)
        */
    }
}