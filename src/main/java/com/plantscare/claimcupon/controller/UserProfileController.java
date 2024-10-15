package com.plantscare.claimcupon.controller;

import com.plantscare.claimcupon.dto.UserInfo;
import com.plantscare.claimcupon.entity.Users;
import com.plantscare.claimcupon.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class UserProfileController {

    Logger log = LoggerFactory.getLogger(UserProfileController.class);

    @Autowired
    UserProfileService userProfileService;

    @GetMapping("/profile/{userId}")
    String getUserProfile(@PathVariable int userId, Model model){
        log.debug("getUserProfile called");
        UserInfo userInfo =  userProfileService.getUserProfile(userId);
        model.addAttribute("user",userInfo);
        return "userprofile";
    }
}
