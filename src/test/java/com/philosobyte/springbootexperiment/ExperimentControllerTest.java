package com.philosobyte.springbootexperiment;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(controllers = ExperimentController.class)
public class ExperimentControllerTest {
    @Test
    public void testGetProperty() {

    }
}
