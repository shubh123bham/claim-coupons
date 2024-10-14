package com.plantscare.claimcupon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Orders {

    @Id
    String orderId;
    @OneToMany
    List<Product> productList;
}
