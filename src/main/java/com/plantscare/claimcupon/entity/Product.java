package com.plantscare.claimcupon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Product {

    @Id
    String productId;
    String name;
    String description;
    String type;
    double price;
    List<String> imgUrls;
}
