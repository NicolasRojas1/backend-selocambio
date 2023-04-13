package com.selocambio.services;

import com.selocambio.entities.AdministradorModel;
import com.selocambio.entities.OfertaModel;
import com.selocambio.repositories.OfertaRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

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

    public OfertaModel editarOfertaById(String idOferta, OfertaModel ofertaModificada) {
        Optional<OfertaModel> ofertaEncontrada = ofertaRepository.buscarPorID(idOferta);
        if (ofertaEncontrada.isPresent()) {
            OfertaModel ofertaActualizada = ofertaEncontrada.get();
            ofertaActualizada.setNombreCli(ofertaModificada.getNombreCli());
            ofertaActualizada.setTelefonoCli(ofertaModificada.getTelefonoCli());
            ofertaActualizada.setCorreoCli(ofertaModificada.getCorreoCli());
            ofertaActualizada.setInteresCli(ofertaModificada.getInteresCli());
            ofertaActualizada.setNombreProd(ofertaModificada.getNombreProd());
            ofertaActualizada.setCategoriaProd(ofertaModificada.getCategoriaProd());
            ofertaActualizada.setDescripcionProd(ofertaModificada.getDescripcionProd());
            ofertaActualizada.setImagenProd(ofertaModificada.getImagenProd());
            return ofertaRepository.save(ofertaActualizada);
        } else {
            // Manejo de error en caso de que no se encuentre la oferta
            return null;
        }
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