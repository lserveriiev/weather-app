package de.weather.gateway.openweather;

import de.weather.gateway.openweather.config.OpenWeatherClientConfig;
import de.weather.gateway.openweather.dto.forecast.ForecastResponse;
import de.weather.gateway.openweather.dto.weather.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "open-weather-client",
        url = "${weather.gateway.openweather.url}",
        configuration = OpenWeatherClientConfig.class
)
public interface OpenWeatherClient {

    @GetMapping(value = "/weather")
    WeatherResponse getCurrentWeather(@RequestParam("q") String city);

    @GetMapping(value = "/forecast")
    ForecastResponse getCurrentForecast(@RequestParam("q") String city);

}
