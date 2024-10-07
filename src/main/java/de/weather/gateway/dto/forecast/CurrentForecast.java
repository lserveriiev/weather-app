package de.weather.gateway.dto.forecast;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class CurrentForecast {

    City city;
    List<Forecast> forecasts;

}
