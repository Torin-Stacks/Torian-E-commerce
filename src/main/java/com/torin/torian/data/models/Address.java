package com.torin.torian.data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Address")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String houseNumber;
    @Column(nullable = false)
    private  String city;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String postalCode;
}
