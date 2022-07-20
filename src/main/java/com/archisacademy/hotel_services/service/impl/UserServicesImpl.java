package com.archisacademy.hotel_services.service.impl;

import com.archisacademy.hotel_services.dto.UserDetailsDTO;
import com.archisacademy.hotel_services.service.UserServices;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {
//    public static String MyName = "Tolga";
//    public static String MyLocation = "Portugal";
//    public static String MyCompany = "Teleperformance";

    @Override
    public String getWelcomeMessage(UserDetailsDTO user) {
        StringBuilder welcome =
                new StringBuilder().append("Hello ").append(user.getName()).append(",");
        List<UserDetailsDTO> userDetails = getUserDetails();
        for (int i = 0; i < userDetails.size(); i++) {
            if (userDetails.get(i).getLocation().equals(user.getLocation())) {
                welcome.append(" ").append(userDetails.get(i).getName());
            }
        }
        welcome = welcome.append(" are from ").append(user.getLocation()).append(" too!");
        return welcome.toString();

//                //Using IF_ELSE method
//                if (user.getName().equals(MyName)
//                        && user.getLocation().equals(MyLocation)
//                        && user.getCompany().equals(MyCompany)) {
//                    return "Merhaba, I am " + user.getName() + " and this is my first SpringBoot
//         Project!";
//                }
//                // using else here was redundant
//                return "Hi, I am "
//                        + user.getName()
//                        + " from "
//                        + user.getCompany()
//                        + ", "
//                        + user.getLocation();
    }

    private List<UserDetailsDTO> getUserDetails() {
        List<UserDetailsDTO> userDetails = new ArrayList<>();
        userDetails.add(0, new UserDetailsDTO("Tofi", "Archis", "Turkey"));
        userDetails.add(1, new UserDetailsDTO("Corey", "Redhat", "England"));
        userDetails.add(2, new UserDetailsDTO("Kemal", "Google", "Korea"));
        userDetails.add(3, new UserDetailsDTO("Ceyda", "Apple", "US"));
        return userDetails;
    }
}
