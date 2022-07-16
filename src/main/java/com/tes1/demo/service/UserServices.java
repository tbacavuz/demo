package com.tes1.demo.service;

import com.tes1.demo.dto.UserDetailsDTO;

public interface UserServices {
    String getWelcomeMessage(UserDetailsDTO user);
}
