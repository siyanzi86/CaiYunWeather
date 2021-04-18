package com.example.caiyunweather

import android.app.Application
import android.content.Context

class CaiYunWeatherApplication : Application() {

    companion object {
        lateinit var context: Context
        const val TOKEN = "" //令牌
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}