package com.selocambio.controller;

import com.selocambio.entities.OfertaModel;
import com.selocambio.services.OfertaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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


    @PostMapping("/editar")
    public Object editarOferta(@RequestBody OfertaModel ofertaModel){
        return ofertaService.editarOfertaById(ofertaModel);
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
    public void eliminarOferta(@PathVariable Integer id){
        ofertaService.eliminarOfertaById(id);

    }
}



