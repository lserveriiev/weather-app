package de.weather.gateway.dto.weather;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Main {

    double temp;
    double feelsLike;
    double tempMin;
    double tempMax;
    double pressure;
    double humidity;
    double seaLevel;
    double grndLevel;

}
