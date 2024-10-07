package de.weather.gateway.dto.weather;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class City {

    String name;
    String country;
    Coord coord;

}
