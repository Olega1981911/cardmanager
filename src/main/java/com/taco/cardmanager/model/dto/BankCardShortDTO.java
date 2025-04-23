package com.taco.cardmanager.model.dto;

import com.taco.cardmanager.model.enums.CardStatus;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BankCardShortDTO {
    private Long id;
    private String cardNumber;
    private LocalDate expiryDate;
    private CardStatus status;
}
