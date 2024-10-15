package com.plantscare.claimcupon.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Builder
public class UserInfo {
    private int userId;
    private String name;
    private String email;
    private String phoneNumber;
    private String parlourName;
    private String address;
    private int pinCode;
    private int points;
}
