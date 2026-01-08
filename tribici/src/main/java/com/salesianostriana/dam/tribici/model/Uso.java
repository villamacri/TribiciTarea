package com.salesianostriana.dam.tribici.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Uso {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double coste;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_bicicleta_uso"))
    private Bicicleta bicicleta;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_estacion_uso"))
    private Estacion estacion;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_usuario_uso"))
    private Usuario usuario;
}
