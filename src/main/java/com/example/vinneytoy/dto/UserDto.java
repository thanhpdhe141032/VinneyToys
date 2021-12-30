package com.example.vinneytoy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private long id;

    private String firstName;

    private String lastName;

    private String phone;

    private String gender;

    private List<String> roles;
}
