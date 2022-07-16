package com.archisacademy.hotel_services.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping(value = "/welcome")
    public String welcomeMessage() {
        return "Hello world!";
    }
}
