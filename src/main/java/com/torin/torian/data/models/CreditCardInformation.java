package com.torin.torian.data.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "CreditCardInformation")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditCardInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String cardNumber;

    @Column(nullable = false)
    private String cvv;

    @Column(nullable = false)
    private String expiryDate;

    @Column(nullable = false)
    private String nameOnCard;
    @Enumerated(EnumType.STRING)
    private CardType cardType;

    @Column(nullable = false)
    private String pin;

}
