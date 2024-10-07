package de.weather.gateway.openweather.dto.forecast;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class ForecastResponse {

    String cod;
    int message;
    int cnt;
    City city;
    List<Forecast> list;

}
