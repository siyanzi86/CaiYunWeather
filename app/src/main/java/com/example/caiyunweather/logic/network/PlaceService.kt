package com.example.caiyunweather.logic.network

import com.example.caiyunweather.CaiYunWeatherApplication
import com.example.caiyunweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${CaiYunWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}