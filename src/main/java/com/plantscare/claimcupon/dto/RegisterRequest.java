package com.plantscare.claimcupon.dto;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class RegisterRequest {
    private String name;
    private String phoneNumber;
    private String email;
    private String parlourName;
    private int pinCode;
    private String address;
    private String password;
}
