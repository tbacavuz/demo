package com.archisacademy.hotel_services.controller;

import com.archisacademy.hotel_services.dto.UserDetailsDTO;
import com.archisacademy.hotel_services.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired private UserServices userServices;

    @PostMapping(value = "/user")
    public String user(@RequestBody UserDetailsDTO userDetailsDTO) {
        return userServices.getWelcomeMessage(userDetailsDTO);
    }
}
