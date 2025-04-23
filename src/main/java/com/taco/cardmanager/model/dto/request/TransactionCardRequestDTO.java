package com.taco.cardmanager.model.dto.request;

import com.taco.cardmanager.model.enums.AmountType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransactionCardRequestDTO {
    @NotNull(message = "Bank card ID is required")
    private Long bankCardId;

    @NotNull(message = "Amount is required")
    @Positive(message = "Amount must be positive")
    private BigDecimal amount;

    @NotNull(message = "Amount type is required")
    private AmountType amountType;
}
