package de.weather.gateway;

import de.weather.gateway.dto.forecast.CurrentForecast;
import de.weather.gateway.dto.weather.CurrentWeather;

public interface WeatherGateway {

    CurrentWeather getCurrentWeather(String city);

    CurrentForecast getCurrentForecast(String city);

}
