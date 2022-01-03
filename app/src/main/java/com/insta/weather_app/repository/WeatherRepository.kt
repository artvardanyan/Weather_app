package com.insta.weather_app.repository

import com.insta.weather_app.api.ApiService
import com.insta.weather_app.api.RetrofitClient

class WeatherRepository {

    suspend fun getWeather() = RetrofitClient.retrofitService.getWeather()

}