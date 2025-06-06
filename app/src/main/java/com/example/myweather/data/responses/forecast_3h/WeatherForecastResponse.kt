package com.example.myweather.data.responses.forecast_3h

import com.example.myweather.data.responses.forecast_3h.objects.City
import com.example.myweather.data.responses.forecast_3h.objects.Forecast3h

data class WeatherForecastResponse(
    val city: City,
    val cnt: Int,
    val list: List<Forecast3h>,
)