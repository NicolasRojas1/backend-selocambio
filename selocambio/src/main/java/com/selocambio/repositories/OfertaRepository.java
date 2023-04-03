package com.selocambio.repositories;

import com.selocambio.entities.OfertaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OfertaRepository extends JpaRepository<OfertaModel, Integer> {
}
