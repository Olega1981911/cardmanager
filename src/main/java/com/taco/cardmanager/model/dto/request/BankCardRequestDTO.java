package com.taco.cardmanager.model.dto.request;

import com.taco.cardmanager.model.enums.CardStatus;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class BankCardRequestDTO {
    @NotBlank(message = "Card number is required")
    @Pattern(regexp = "^[0-9]{16}$", message = "Invalid card number format")
    private String cardNumber;

    @NotBlank(message = "Owner name is required")
    private String ownerName;

    @NotNull(message = "Expiry date is required")
    @Future(message = "Expiry date must be in the future")
    private LocalDate expiryDate;

    @NotNull(message = "Status is required")
    private CardStatus status;

    @DecimalMin(value = "0.0", message = "Balance cannot be negative")
    private BigDecimal balance;

    @NotNull(message = "User ID is required")
    private Long userId;
}
