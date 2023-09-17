package com.torin.torian.data.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false, unique = true)
    private String emailAddress;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Address> address;
    @Column(nullable = false)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CreditCardInformation> creditCardInformation;
}
