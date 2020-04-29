package com.philosobyte.springbootexperiment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan("com.philosobyte")
@SpringBootApplication
public class SpringbootexperimentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootexperimentApplication.class, args);
    }

}
