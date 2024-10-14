package com.plantscare.claimcupon.dto;


import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class LoginRequest {
    String email;
    String password;
}
