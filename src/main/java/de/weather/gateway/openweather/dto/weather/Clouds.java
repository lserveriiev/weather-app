package de.weather.gateway.openweather.dto.weather;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Clouds {

    int all;

}
