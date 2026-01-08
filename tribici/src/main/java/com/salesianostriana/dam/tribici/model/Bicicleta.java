package com.salesianostriana.dam.tribici.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bicicleta {
    @Id
    @GeneratedValue
    private Long id;

    private String marca;
    private String modelo;
    private Estado estado;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_estacion_bicicleta"))
    private Estacion estacion;

    @OneToMany(
            mappedBy = "bicicleta",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Uso> usos=new ArrayList<>();
}
