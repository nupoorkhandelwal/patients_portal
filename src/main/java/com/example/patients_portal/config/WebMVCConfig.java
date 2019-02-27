package com.example.patients_portal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
public class WebMVCConfig extends WebMvcConfigurerAdapter {
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/patients_portal").allowedOrigins("http://localhost:3000/patient_portal/patients","*")
                .allowedMethods("POST","GET","PUT","OPTIONS","DELETE")
                .allowedHeaders("X-AUTH-Token","Content-Type")
                .allowCredentials(false)
                .maxAge(4800);
    }


}
