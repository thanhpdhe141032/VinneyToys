package com.example.vinneytoy.service;

import com.example.vinneytoy.dto.ResponseDTO;
import com.example.vinneytoy.models.RegisterRequest;
import com.example.vinneytoy.models.User;

public interface RegisterService {

    public User register(RegisterRequest register);

    public User findUserByUsername(String name);


}
