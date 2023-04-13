package com.selocambio.repositories;

import com.selocambio.entities.OfertaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


@Repository
public interface OfertaRepository extends JpaRepository<OfertaModel, Integer> {

       @Query(value= "SELECT * from oferta where CategoriaProd=:categoria", nativeQuery = true)
       List<OfertaModel> buscarPorCategoria(@Param("categoria") String categoria);

       @Query(value= "SELECT * from oferta where idOferta=:idoferta", nativeQuery = true)
       Optional<OfertaModel> buscarPorID(@Param("idoferta") String idOferta);

       @Query(value= "SELECT * from oferta where NombreCli=:nombrecli", nativeQuery = true )
       List<OfertaModel> buscarPorNombreCli(@Param("nombrecli") String nombreCli);

}