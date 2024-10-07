package de.weather.gateway.openweather.dto.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class Forecast {

    long dt;
    Main main;
    List<Weather> weather;
    Clouds clouds;
    Wind wind;
    double visibility;
    int pop;
    Sys sys;
    @JsonProperty("dt_txt")
    String dtTxt;

}
