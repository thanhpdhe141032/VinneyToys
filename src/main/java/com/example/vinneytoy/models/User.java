package com.example.vinneytoy.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String userName;
    private String userPassword;
    private List<String> role;
    private String phone;
    private boolean status;
    private Timestamp createdAt;

}
