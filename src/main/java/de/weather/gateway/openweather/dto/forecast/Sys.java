package de.weather.gateway.openweather.dto.forecast;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Sys {

    String pod;

}
