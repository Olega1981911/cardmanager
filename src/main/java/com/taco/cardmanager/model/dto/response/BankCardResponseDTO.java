package com.taco.cardmanager.model.dto.response;

import com.taco.cardmanager.model.dto.UserShortDTO;
import com.taco.cardmanager.model.enums.CardStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class BankCardResponseDTO {
    private Long id;
    private String cardNumber;
    private String ownerName;
    private LocalDate expiryDate;
    private CardStatus status;
    private BigDecimal balance;
    private UserShortDTO user;
}
