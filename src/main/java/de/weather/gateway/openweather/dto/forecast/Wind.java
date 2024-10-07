package de.weather.gateway.openweather.dto.forecast;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Wind {

    double speed;
    double deg;
    double gust;

}
