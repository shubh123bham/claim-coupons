package com.plantscare.claimcupon.service;

import com.plantscare.claimcupon.entity.Users;
import com.plantscare.claimcupon.repository.UserRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    @Autowired
    UserRepoService userRepoService;

    public Users getUserProfile(int id){
        return userRepoService.getReferenceById(id);
    }

}
