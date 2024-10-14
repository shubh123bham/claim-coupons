package com.plantscare.claimcupon.repository;

import com.plantscare.claimcupon.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepoService extends JpaRepository<Users,Integer> {
    Users findUserByEmail(String email);
}
