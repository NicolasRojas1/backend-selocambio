package com.selocambio.services;

import com.selocambio.entities.AdministradorModel;
import com.selocambio.entities.OfertaModel;
import com.selocambio.repositories.OfertaRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import java.util.List;

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

    public OfertaModel editarOfertaById( OfertaModel ofertaEdit){
        //OfertaModel ofertaEncontrada = ofertaRepository.findById(idOferta).get();//
          return ofertaRepository.save(ofertaEdit);
    }

    public List<OfertaModel> obtenerOfertas(){
        return ofertaRepository.findAll();
    }

    public List<OfertaModel> buscarOfertaPorCategoria(String categoria) {
        return ofertaRepository.buscarPorCategoria(categoria);
    }

    public List<OfertaModel> buscarOfertaPorNombreCli(String nombreCli) {
        return ofertaRepository.buscarPorNombreCli(nombreCli);
    }





}