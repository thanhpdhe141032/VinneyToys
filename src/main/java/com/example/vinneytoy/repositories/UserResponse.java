package com.example.vinneytoy.repositories;

import com.example.vinneytoy.models.Role;
import com.example.vinneytoy.models.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserResponse {
    private Role adminRole = new Role(1, "ADMIN");
    private Role userRole = new Role(2, "USER");
}
