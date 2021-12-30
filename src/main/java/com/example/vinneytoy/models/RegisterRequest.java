package com.example.vinneytoy.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegisterRequest {
    @NotEmpty
    @NotNull
    private String userName;
    @NotEmpty
    @NotNull
    @Size(min = 4, max = 20, message = "Password is character and must contain 8 - 16 characters")
    private String password;
    @NotEmpty
    @NotNull
    private String firstName;
    @NotEmpty
    @NotNull
    private String lastName;
    @Pattern(regexp = "(09|01[2|6|8|9])+([0-9]{8})\\b", message = "Invalid phone number")
    private String phone;
    @NotEmpty
    @NotNull
    @Email(message = "Invalid email")
    private String mail;
}
