package com.torin.torian.data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = " ShoppingCart")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private List<Items> item;
}
