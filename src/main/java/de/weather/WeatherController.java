package de.weather;

import de.weather.gateway.WeatherGateway;
import de.weather.gateway.dto.forecast.CurrentForecast;
import de.weather.gateway.dto.weather.CurrentWeather;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherGateway weatherGateway;

    @GetMapping(value = "/weather")
    public CurrentWeather getWeather(@RequestParam String city) {
        return this.weatherGateway.getCurrentWeather(city);
    }

    @GetMapping(value = "/forecast")
    public CurrentForecast getCurrentForecast(@RequestParam String city) {
        return this.weatherGateway.getCurrentForecast(city);
    }
}
