package com.example.gateway.filters;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class JwtValidationFilterFactory extends AbstractGatewayFilterFactory<JwtValidationFilterFactory.Config> {

    public JwtValidationFilterFactory() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return new JwtValidationFilter();
    }

    public static class Config {
        // Configuration properties if needed
    }
}