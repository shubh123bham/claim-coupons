package com.plantscare.claimcupon.service;

import com.plantscare.claimcupon.dto.RegisterRequest;
import com.plantscare.claimcupon.entity.Users;
import com.plantscare.claimcupon.repository.UserRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private UserRepoService userRepoService;

    public Users registerNewUser(RegisterRequest registerRequest){
        Users users = userRepoService.getReferenceById(registerRequest.getPhoneNumber());
        if(users!=null){
            System.out.println("the user already exists");
        }else{
            System.out.println("creating the user");
            users = Users.builder()
                    .email(registerRequest.getEmail())
                    .phoneNumber(registerRequest.getPhoneNumber())
                    .name(registerRequest.getName())
                    .pinCode(registerRequest.getPinCode())
                    .parlourName(registerRequest.getParlourName())
                    .address(registerRequest.getAddress())
                    .password(registerRequest.getPassword())
                    .points(500)
                    .build();
            userRepoService.save(users);
        }
        return users;
    }
}
