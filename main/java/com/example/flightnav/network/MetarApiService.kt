package com.example.flightnav.network

import okhttp3.ResponseBody
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_METAR_URL = "https://www.aviationweather.gov/adds/dataserver_current/current/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_METAR_URL)
    .build()

interface MetarApiService
{
    @GET("metars.cache.csv.gz")
    suspend fun getMETARs(): ResponseBody

    @GET("tafs.cache.csv.gz")
    suspend fun getTAFs(): ResponseBody
}

object WebserverAPI
{
    val retrofitService: MetarApiService by lazy {
        retrofit.create(MetarApiService::class.java)
    }
}