package com.example.caiyunweather.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.caiyunweather.logic.Repository
import com.example.caiyunweather.logic.model.Location

class WeatherViewModel : ViewModel() {

    private val locationLiveData = MutableLiveData<Location>()

    var locationLng = ""
    var locationLat = ""
    var placeName = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData) { location ->
        Repository.refreshWeather(location.lng, location.lat, placeName)
    }

    fun refreshWeather(lng: String, lat: String) {
        locationLiveData.value = Location(lng, lat)
    }
}