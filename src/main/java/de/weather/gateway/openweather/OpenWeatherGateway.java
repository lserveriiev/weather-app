package de.weather.gateway.openweather;

import de.weather.gateway.WeatherGateway;
import de.weather.gateway.dto.forecast.CurrentForecast;
import de.weather.gateway.dto.weather.CurrentWeather;
import de.weather.gateway.openweather.dto.forecast.ForecastResponse;
import de.weather.gateway.openweather.dto.weather.WeatherResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OpenWeatherGateway implements WeatherGateway {

    private final OpenWeatherMapper mapper;
    private final OpenWeatherClient openWeatherClient;

    @Override
    public CurrentWeather getCurrentWeather(String city) {
        WeatherResponse weatherResponse = openWeatherClient.getCurrentWeather(city);

        return mapper.toCurrentWeather(weatherResponse);
    }

    @Override
    public CurrentForecast getCurrentForecast(String city) {
        ForecastResponse forecastResponse = openWeatherClient.getCurrentForecast(city);

        return mapper.toCurrentForecast(forecastResponse);
    }
}
