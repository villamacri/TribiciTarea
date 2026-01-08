package com.salesianostriana.dam.tribici.repository;

import com.salesianostriana.dam.tribici.model.Bicicleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {
}
