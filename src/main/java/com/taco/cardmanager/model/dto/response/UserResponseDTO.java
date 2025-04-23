package com.taco.cardmanager.model.dto.response;

import com.taco.cardmanager.model.dto.BankCardShortDTO;
import com.taco.cardmanager.model.enums.UserRole;
import lombok.Data;


import java.util.List;
@Data
public class UserResponseDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private UserRole userRole;
    private List<BankCardShortDTO> bankCards;
}
