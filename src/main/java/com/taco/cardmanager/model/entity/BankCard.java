package com.taco.cardmanager.model.entity;

import com.taco.cardmanager.model.enums.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bank_cards")
@Builder
public class BankCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String cardNumber; //code card
    @Column(nullable = false)
    private String ownerName;
    @Column(nullable = false)
    private LocalDate expiryDate;
    @Enumerated(EnumType.STRING)
    private CardStatus status;
    @Column(nullable = false)
    private BigDecimal balance;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @OneToMany(mappedBy = "bankCard", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TransactionCard> transactions;
}
