package com.torin.torian.data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="items")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Product product;
    @Column(nullable = false)
    private long quantity;
}
