package com.philosobyte.springbootexperiment;

import org.junit.jupiter.api.Test;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@ConfigurationPropertiesScan
@ConfigurationPropertiesScan
@WebMvcTest(controllers = ExperimentController.class)
public class ExperimentControllerTest {
    @Test
    public void testGetProperty() {

    }
}
