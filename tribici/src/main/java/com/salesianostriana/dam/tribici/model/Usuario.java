package com.salesianostriana.dam.tribici.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Usuario {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String numTarjeta;
    private int pin;
    private double saldo;

    @Builder.Default
    @ToString.Exclude
    @OneToMany(
            mappedBy = "usuario",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Uso> usos=new ArrayList<>();
}
