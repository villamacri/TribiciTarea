package com.salesianostriana.dam.tribici.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsoRepository extends JpaRepository<UsoRepository, Long> {
}
