package com.archisacademy.hotel_services.service;

import com.archisacademy.hotel_services.dto.UserDetailsDTO;

public interface UserServices {
    String getWelcomeMessage(UserDetailsDTO user);
}
