package de.weather.gateway.dto.forecast;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Weather {

    String main;
    String description;

}
