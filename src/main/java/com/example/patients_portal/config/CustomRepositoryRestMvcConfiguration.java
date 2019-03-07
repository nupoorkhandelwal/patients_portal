package com.example.patients_portal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.hateoas.MediaTypes;

@Configuration
public class CustomRepositoryRestMvcConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.setReturnBodyOnCreate(true);
        config.setReturnBodyForPutAndPost(true);
        config.setReturnBodyOnUpdate(true);
        config.setMaxPageSize(250);
        config.setDefaultPageSize(50);
        config.setDefaultMediaType(MediaTypes.HAL_JSON);
        config.useHalAsDefaultJsonMediaType(true);

        CorsConfiguration.applyFullCorsAllowedPolicy(config.getCorsRegistry());
    }
}