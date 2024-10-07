package de.weather.gateway.dto.forecast;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Wind {

    double speed;
    double deg;
    double gust;

}
