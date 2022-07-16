package com.archisacademy.hotel_services.service.impl;

import com.archisacademy.hotel_services.service.UserServices;
import com.archisacademy.hotel_services.dto.UserDetailsDTO;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {
    public static String MyName = "Tolga";
    public static String MyLocation = "Portugal";
    public static String MyCompany = "Teleperformance";

    @Override
    public String getWelcomeMessage(UserDetailsDTO user) {
        if (user.getName().equals(MyName)
                && user.getLocation().equals(MyLocation)
                && user.getCompany().equals(MyCompany)) {
            return "Merhaba, I am " + user.getName() + " and this is my first SpringBoot Project!";
        }
        // using else here was redundant
        return "Hi, I am "
                + user.getName()
                + " from "
                + user.getCompany()
                + ", "
                + user.getLocation();
    }
}
