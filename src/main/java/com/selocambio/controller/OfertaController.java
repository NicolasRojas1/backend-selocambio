package com.selocambio.controller;

import com.selocambio.entities.OfertaModel;
import com.selocambio.services.OfertaService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/oferta")
public class OfertaController {

    OfertaService ofertaService;

    public OfertaController(OfertaService ofertaService) {
        this.ofertaService = ofertaService;
    }

    @PostMapping("/crear")
    public Object crearOferta(@RequestBody OfertaModel ofertaModel){
        return ofertaService.crearOferta(ofertaModel);
    }


    @PostMapping(value = "/editar/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Object editarOferta(@PathVariable String id, @RequestBody OfertaModel ofertaModel){
        return ofertaService.editarOfertaById(id, ofertaModel);
    }

    @GetMapping("/obtener")
    public List<OfertaModel> obtenerOferta(){
        return ofertaService.obtenerOfertas();
    }

    @GetMapping(value = "/obtener/{id}")
    public Object obtenerOferta(@PathVariable Integer id){
        return ofertaService.obtenerOferta(id);
    }

    @DeleteMapping(value = "/eliminar/{id}")
    public void eliminarOfertaById(@PathVariable Integer id){
        ofertaService.eliminarOfertaById(id);
    }
    @GetMapping(value = "/buscar-categoria/{categoria}")
    public List<OfertaModel> buscarPorCategoria(@PathVariable String categoria){
        return ofertaService.buscarOfertaPorCategoria(categoria);
    }

    @GetMapping(value = "/buscar-nombreCliente/{nombrecli}")
    public List<OfertaModel> buscarPorNombreCli(@PathVariable String nombrecli){
        return ofertaService.buscarOfertaPorNombreCli(nombrecli);
    }

}



