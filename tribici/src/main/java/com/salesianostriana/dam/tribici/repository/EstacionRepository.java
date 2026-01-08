package com.salesianostriana.dam.tribici.repository;

import com.salesianostriana.dam.tribici.model.Estacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstacionRepository extends JpaRepository<Estacion, Long> {
}
