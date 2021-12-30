package com.example.vinneytoy.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginRequest {
    @NotNull(message = "Empty User Name")
    @NotEmpty(message = "Empty User Name")
    @JsonProperty
    private String username;

    @NotNull(message = "Empty Password")
    @NotEmpty(message = "Empty Password")
    @JsonProperty
    @Size(min = 4, max = 20, message = "Password is character and must contain 8 - 16 characters")
    private String password;
}
