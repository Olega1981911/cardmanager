package com.taco.cardmanager.model.entity;

import com.taco.cardmanager.model.enums.AmountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "bank_card_id", nullable = false)
    private BankCard bankCard;
    @Column(nullable = false)
    private BigDecimal amount;
    @Column(nullable = false)
    private LocalDateTime transactionDate;
    @Column(nullable = false)
    private AmountType amountType;
}
