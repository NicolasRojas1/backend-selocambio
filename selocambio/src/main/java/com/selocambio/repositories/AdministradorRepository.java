package com.selocambio.repositories;

import com.selocambio.entities.AdministradorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdministradorRepository extends JpaRepository<AdministradorModel, Integer> {
}
