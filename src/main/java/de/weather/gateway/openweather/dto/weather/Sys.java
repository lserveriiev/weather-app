package de.weather.gateway.openweather.dto.weather;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Sys {

    int type;
    long id;
    String country;
    long sunrise;
    long sunset;

}
