package com.tes1.demo.controller;

import com.tes1.demo.dto.UserDetailsDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping(value = "/user")
    public String user(@RequestBody UserDetailsDTO userDetailsDTO) {
        return "Hi, I am "
                + userDetailsDTO.getName()
                + " from "
                + userDetailsDTO.getCompany()
                + ", "
                + userDetailsDTO.getLocation();
    }
}
