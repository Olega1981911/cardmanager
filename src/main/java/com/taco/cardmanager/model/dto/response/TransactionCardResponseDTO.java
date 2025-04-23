package com.taco.cardmanager.model.dto.response;

import com.taco.cardmanager.model.enums.AmountType;
import lombok.Data;


import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class TransactionCardResponseDTO {
    private Long id;
    private Long bankCardId;
    private BigDecimal amount;
    private LocalDateTime transactionDate;
    private AmountType amountType;
}
