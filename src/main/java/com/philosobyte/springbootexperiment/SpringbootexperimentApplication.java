package com.philosobyte.springbootexperiment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.philosobyte")
@SpringBootApplication
public class SpringbootexperimentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootexperimentApplication.class, args);
    }

}
