package com.selocambio.services;

import com.selocambio.entities.OfertaModel;
import com.selocambio.repositories.OfertaRepository;
import org.springframework.stereotype.Service;

@Service
public class OfertaService {

    OfertaRepository ofertaRepository;

    public OfertaService(OfertaRepository ofertaRepository) {
        this.ofertaRepository = ofertaRepository;
    }

    public Object crearOferta(OfertaModel ofertaModel){
        return ofertaRepository.save(ofertaModel);
    }

    public Object obtenerOferta(Integer idOferta){
        return ofertaRepository.findById(idOferta);
    }

    public void eliminarOfertaById(Integer idOferta){
        ofertaRepository.deleteById(idOferta);
    }




}