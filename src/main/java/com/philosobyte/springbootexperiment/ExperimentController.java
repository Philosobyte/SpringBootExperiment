package com.philosobyte.springbootexperiment;

import inet.ipaddr.IPAddressString;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ExperimentController {
    private final ExperimentComponent component;

    @GetMapping("/increment/{addr}")
    public String increment(@PathVariable("addr") String addr) {
        log.info("increment {}: {}", addr, new IPAddressString(addr).getAddress().increment(1));
        return "success";
    }

    @GetMapping("/decrement/{addr}")
    public String decrement(@PathVariable("addr") String addr) {
        log.info("decrement {}: {}", addr, new IPAddressString(addr).getAddress().increment(-1));
        return "success";
    }

    @GetMapping("/get-property")
    public String getProperty() {
        log.info("Component: {}", component);
        log.info("Property: {}", component.getSubProperty());
        return component.getSubProperty();
    }
}
