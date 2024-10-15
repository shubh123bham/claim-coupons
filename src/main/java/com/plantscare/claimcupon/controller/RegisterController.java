package com.plantscare.claimcupon.controller;

import com.plantscare.claimcupon.dto.RegisterRequest;
import com.plantscare.claimcupon.dto.UserInfo;
import com.plantscare.claimcupon.entity.Users;
import com.plantscare.claimcupon.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class RegisterController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/register")
    String showRegistration(){
        return "registerform";
    }

    @PostMapping("/register")
    RedirectView registerUser(@ModelAttribute RegisterRequest registerRequest, Model model){
        UserInfo userInfo = registrationService.registerNewUser(registerRequest);
        return new RedirectView("/profile/" + userInfo.getUserId());
    }
}

