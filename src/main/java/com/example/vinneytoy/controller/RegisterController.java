package com.example.vinneytoy.controller;

import com.example.vinneytoy.models.Register;
import com.example.vinneytoy.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @PostMapping("/register")
    public ResponseEntity<ResponseDTO> register(@RequestBody Register register){

    }
}
