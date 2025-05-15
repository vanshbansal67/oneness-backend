package com.solar.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String userEmail;

    @NotBlank(message = "Password is required")
    private String userPassword;
}
