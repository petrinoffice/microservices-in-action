package com.cheesecakes.test.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Date;

@RestController
public class MainController {

    @Value("${example.property}")
    private String propertyValue = "Don't get properties";

    @GetMapping("/")
    public Mono<String> main(){
        return Mono.just("Current date: " + new Date() + propertyValue);
    }
}
