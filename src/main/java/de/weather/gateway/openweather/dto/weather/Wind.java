package de.weather.gateway.openweather.dto.weather;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Wind {

    double speed;
    double deg;

}
