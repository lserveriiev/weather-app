package de.weather.gateway.openweather.dto.weather;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class WeatherResponse {

    Coord coord;
    List<Weather> weather;
    String base;
    Main main;
    double visibility;
    Wind wind;
    Clouds clouds;
    long dt;
    Sys sys;
    int timezone;
    long id;
    String name;
    int cod;

}
