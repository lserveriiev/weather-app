package de.weather.gateway.openweather.dto.weather;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Weather {

    long id;
    String main;
    String description;
    String icon;

}
