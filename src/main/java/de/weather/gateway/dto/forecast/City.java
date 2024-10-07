package de.weather.gateway.dto.forecast;

import de.weather.gateway.dto.weather.Coord;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class City {

    String name;
    String country;
    Coord coord;

}
