package com.selocambio.repositories;

import com.selocambio.entities.AdministradorModel;
import com.selocambio.entities.OfertaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministradorRepository extends JpaRepository<AdministradorModel, Integer> {
    @Query(value= "SELECT * from administrador where nombre=:nombre" , nativeQuery = true )
    List<AdministradorModel> buscarPorNombre(@Param("nombre") String nombre);

    @Query(value = "SELECT * FROM administrador WHERE dni = :dni AND password = :password AND codigo = :codigo", nativeQuery = true)
    List<AdministradorModel> validarLogin(@Param("dni") String dni,@Param("password") String password,@Param("codigo") String codigo);

}