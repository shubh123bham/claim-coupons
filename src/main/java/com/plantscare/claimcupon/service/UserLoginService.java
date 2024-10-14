package com.plantscare.claimcupon.service;


import com.plantscare.claimcupon.dto.LoginRequest;
import com.plantscare.claimcupon.entity.Users;
import com.plantscare.claimcupon.repository.UserRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    @Autowired
    UserRepoService userRepoService;

    public boolean authenticate(LoginRequest loginRequest){
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();
        if(userRepoService.findUserByEmail(email)!=null){
            Users users = userRepoService.findUserByEmail(email);
            if(users.getPassword().equals(password)){
                System.out.println("user exist");
                return true;
            }else{
                System.out.println("wrong password");

                return false;
            }
        }
        return false;
    }

}
