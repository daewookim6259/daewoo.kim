package com.elevenst.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthchk")
public class HealthchkController {

    @GetMapping(path = "{healthchkVal}")
    public String getHealthchk(@PathVariable String healthchkVal) {

        return healthchkVal;
    }
}
