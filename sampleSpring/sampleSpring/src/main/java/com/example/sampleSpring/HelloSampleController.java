package com.example.sampleSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSampleController {

    @GetMapping("/welcome")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}