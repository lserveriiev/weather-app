package de.weather.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "weather.gateway")
@Data
public class WeatherGatewayProperties {

    private String source;
    private OpenWeather openweather;


    @Data
    public static class OpenWeather {
        private String url;
        private String appId;
    }

}
