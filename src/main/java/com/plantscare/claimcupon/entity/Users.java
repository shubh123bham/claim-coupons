package com.plantscare.claimcupon.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private String email;
    private String password;
    private String name;
    @Id
    private int phoneNumber;
    private String parlourName;
    private int points;

    private String address;
    private int pinCode;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Orders> ordersList;

    @Override
    public String toString() {
        return "Users{" +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", parlourName='" + parlourName + '\'' +
                ", points=" + points +
                ", address='" + address + '\'' +
                ", pinCode=" + pinCode +
                ", ordersList=" + ordersList +
                '}';
    }
}
