package com.tes1.demo.controller;

import com.tes1.demo.dto.UserDetailsDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    public static String MyName = "Tolga";
    public static String MyLocation = "Portugal";
    public static String MyCompany = "Teleperformance";

    @PostMapping(value = "/user")
    public String user(@RequestBody UserDetailsDTO userDetailsDTO) {
        if (userDetailsDTO.getName().equals(MyName)
                && userDetailsDTO.getLocation().equals(MyLocation)
                && userDetailsDTO.getCompany().equals(MyCompany)) {
            return "Merhaba, I am "
                    + userDetailsDTO.getName()
                    + " and this is my first SpringBoot Project!";
        }
        //using else here was redundant
        return "Hi, I am "
                + userDetailsDTO.getName()
                + " from "
                + userDetailsDTO.getCompany()
                + ", "
                + userDetailsDTO.getLocation();
    }
}
