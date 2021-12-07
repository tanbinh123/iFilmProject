package com.example.ifilm.dto;

import com.example.ifilm.validator.PasswordMatches;
import com.example.ifilm.validator.ValidEmail;
import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data
@PasswordMatches
public class UserDTO implements Serializable {
    @NotNull
    @NotEmpty
    private String firstName;

    @NotNull
    @NotEmpty
    private String lastName;

    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;

    @NotNull
    @NotEmpty
    @ValidEmail
    private String email;
}
