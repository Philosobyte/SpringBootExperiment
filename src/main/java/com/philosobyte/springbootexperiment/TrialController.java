package com.philosobyte.springbootexperiment;

import org.springframework.web.bind.annotation.*;

@RestController
public class TrialController {

    @GetMapping("/trial")
    public String trial() {
        return "trial";
    }
}
