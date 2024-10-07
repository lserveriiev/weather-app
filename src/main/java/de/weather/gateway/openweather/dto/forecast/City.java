package de.weather.gateway.openweather.dto.forecast;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class City {

    long id;
    String name;
    Coord coord;
    String country;
    long population;
    int timezone;
    long sunrise;
    long sunset;

}
