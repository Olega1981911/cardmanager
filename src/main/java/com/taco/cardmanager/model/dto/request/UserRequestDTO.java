package com.taco.cardmanager.model.dto.request;

import com.taco.cardmanager.model.enums.UserRole;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;



@Data
public class UserRequestDTO {
    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;

    private UserRole userRole;
}
