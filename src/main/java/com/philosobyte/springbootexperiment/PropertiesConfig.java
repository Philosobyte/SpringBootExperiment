package com.philosobyte.springbootexperiment;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationPropertiesScan("com.philosobyte")
public class PropertiesConfig {
}
