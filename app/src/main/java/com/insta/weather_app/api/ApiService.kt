package com.insta.weather_app.api

import com.insta.weather_app.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("weather/Luanda")
     suspend fun getWeather(): Response<Weather>
}