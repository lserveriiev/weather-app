package de.weather.gateway.dto.forecast;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class Forecast {

    Main main;
    List<Weather> weather;
    Clouds clouds;
    Wind wind;
    String dtTxt;

}
