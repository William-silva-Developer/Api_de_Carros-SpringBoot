package com.alga.alga.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alga.alga.domain.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

}
