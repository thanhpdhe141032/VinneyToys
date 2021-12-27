package com.example.vinneytoy.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Register {
    private String userName;
    private String userPassword;
    private String lastName;
    private String firstName;
    private String dob;
    private String gender;
    private String phoneNumber;
    private String accountId;
}
