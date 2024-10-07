package de.weather.gateway.dto.weather;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Coord {

    double lat;
    double lon;

}
