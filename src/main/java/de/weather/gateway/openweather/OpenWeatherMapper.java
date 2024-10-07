package de.weather.gateway.openweather;

import de.weather.gateway.dto.forecast.CurrentForecast;
import de.weather.gateway.dto.weather.City;
import de.weather.gateway.dto.weather.Coord;
import de.weather.gateway.dto.weather.CurrentWeather;
import de.weather.gateway.openweather.dto.forecast.ForecastResponse;
import de.weather.gateway.openweather.dto.weather.WeatherResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface OpenWeatherMapper {

    @Mapping(target = "forecasts", source = "list")
    CurrentForecast toCurrentForecast(ForecastResponse forecastResponse);

    @Mapping(target = "city", expression = "java( toCity(weatherResponse) )")
    CurrentWeather toCurrentWeather(WeatherResponse weatherResponse);

    default City toCity(WeatherResponse weatherResponse) {
        return City.builder()
                .name(weatherResponse.getName())
                .country(weatherResponse.getSys().getCountry())
                .coord(Coord.builder()
                        .lat(weatherResponse.getCoord().getLat())
                        .lon(weatherResponse.getCoord().getLon())
                        .build()
                )
                .build();
    }
}
