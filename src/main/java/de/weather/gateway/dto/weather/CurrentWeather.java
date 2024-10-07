package de.weather.gateway.dto.weather;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Builder
@Value
public class CurrentWeather {

    City city;
    List<Weather> weather;
    Main main;
    Wind wind;

}
