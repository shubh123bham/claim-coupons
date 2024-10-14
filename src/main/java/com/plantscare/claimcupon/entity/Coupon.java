package com.plantscare.claimcupon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Coupon {

    @Id
    String couponCode;
    int points;
    boolean flag;
}
