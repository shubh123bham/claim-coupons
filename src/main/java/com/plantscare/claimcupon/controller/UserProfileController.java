package com.plantscare.claimcupon.controller;

import com.plantscare.claimcupon.entity.Users;
import com.plantscare.claimcupon.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {

    @Autowired
    UserProfileService userProfileService;

    @GetMapping("/profile/{userId}")
    String getUserProfile(@PathVariable int userId){
        Users users =  userProfileService.getUserProfile(userId);
        return users.toString();
    }
}
