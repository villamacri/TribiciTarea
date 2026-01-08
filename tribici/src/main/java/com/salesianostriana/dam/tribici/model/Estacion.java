package com.salesianostriana.dam.tribici.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Estacion {
    @Id
    @GeneratedValue
    private Long id;

    private int numero;
    private String nombre;
    private String coordenadas;
    private int capacidad;

    @Builder.Default
    @ToString.Exclude
    @OneToMany(
            mappedBy = "estacion",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Bicicleta> bicicletas = new ArrayList<>();

    @Builder.Default
    @ToString.Exclude
    @OneToMany(
            mappedBy = "estacion",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Uso> usos=new ArrayList<>();
}
