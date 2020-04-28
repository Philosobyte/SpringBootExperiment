package com.philosobyte.springbootexperiment;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExperimentComponent {
    private final ExperimentalProperties properties;

    public String getSubProperty() {
        return properties.getProperty();
    }

    @Data
    @ConfigurationProperties(prefix = "experiment")
    public static class ExperimentalProperties {
        private String property = "lol";
    }
}
