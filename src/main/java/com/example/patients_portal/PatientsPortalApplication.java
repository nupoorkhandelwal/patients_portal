package com.example.patients_portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class PatientsPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsPortalApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
          public void addCorsMappings(CorsRegistry registry) {
              registry.addMapping("/patients_portal").allowedOrigins("*")
              .allowedMethods("POST","GET","PUT","OPTIONS","DELETE")
              .allowedHeaders("X-AUTH-Token","Content-Type")
              .allowCredentials(false)
              .maxAge(4800);
          }
        };
    }
}
