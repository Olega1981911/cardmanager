package com.taco.cardmanager.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserShortDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
