package de.weather.gateway.openweather.dto.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Main {

    double temp;
    @JsonProperty("feels_like")
    double feelsLike;
    @JsonProperty("temp_min")
    double tempMin;
    @JsonProperty("temp_max")
    double tempMax;
    double pressure;
    double humidity;
    @JsonProperty("sea_level")
    double seaLevel;
    @JsonProperty("grnd_level")
    double grndLevel;

}
