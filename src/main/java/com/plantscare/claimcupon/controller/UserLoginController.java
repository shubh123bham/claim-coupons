package com.plantscare.claimcupon.controller;


import com.plantscare.claimcupon.dto.LoginRequest;
import com.plantscare.claimcupon.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.*;

@RestController
public class UserLoginController {

    Logger log = LoggerFactory.getLogger(UserLoginController.class);

    @Autowired
    UserLoginService userLoginService;

    @GetMapping("/login")
    String loginForm(){
        log.debug("login form called");
        return "login";
    }

    @PostMapping("/login")
    String processLogin(@RequestParam LoginRequest loginRequest){
        userLoginService.authenticate(loginRequest);
        return "ok";
    }
}
