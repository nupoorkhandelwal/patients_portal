package com.example.patients_portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PatientsPortalApplication {

    public static void main(String[] args) {

        SpringApplication.run(PatientsPortalApplication.class, args);
    }

}
