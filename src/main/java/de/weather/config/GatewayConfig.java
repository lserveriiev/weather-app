package de.weather.config;

import de.weather.gateway.WeatherGateway;
import de.weather.gateway.openweather.OpenWeatherClient;
import de.weather.gateway.openweather.OpenWeatherGateway;
import de.weather.gateway.openweather.OpenWeatherMapper;
import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    @ConditionalOnProperty(prefix = "weather.gateway", name = "source", havingValue = "openweather")
    public WeatherGateway weatherGateway(
            OpenWeatherMapper mapper,
            OpenWeatherClient openWeatherClient
    ) {
        return new OpenWeatherGateway(mapper, openWeatherClient);
    }

    @Bean
    @ConditionalOnProperty(prefix = "weather.gateway", name = "source", havingValue = "openweather")
    public RequestInterceptor requestInterceptor(
            @Value("${weather.gateway.openweather.appId}") String appId
    ) {
        return requestTemplate -> requestTemplate.query("appid", appId);
    }

}
