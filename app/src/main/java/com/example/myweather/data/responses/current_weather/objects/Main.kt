package com.example.myweather.data.responses.current_weather.objects

import kotlinx.serialization.Serializable

@Serializable
data class Main(
    val feels_like: Double,
    val grnd_level: Int,
    val humidity: Int,
    val pressure: Int,
    val sea_level: Int,
    val temp: Double,
    val temp_max: Double,
    val temp_min: Double
)