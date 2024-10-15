package com.plantscare.claimcupon.service;

import com.plantscare.claimcupon.dto.UserInfo;
import com.plantscare.claimcupon.entity.Users;
import com.plantscare.claimcupon.repository.UserRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserProfileService {

    Logger log = LoggerFactory.getLogger(UserProfileService.class);

    @Autowired
    UserRepoService userRepoService;

    public UserInfo getUserProfile(int userId){
        Users users = userRepoService.getReferenceById(userId);
        if(users!=null){
            UserInfo userInfo = UserInfo.builder()
                    .name(users.getName())
                    .email(users.getEmail())
                    .address(users.getAddress())
                    .parlourName(users.getParlourName())
                    .points(users.getPoints())
                    .userId(users.getUserId())
                    .phoneNumber(users.getPhoneNumber())
                    .build();
            return userInfo;
        }
        log.debug("user dosent exits");
        return null;
    }

}
