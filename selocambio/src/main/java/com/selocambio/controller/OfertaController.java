package com.selocambio.controller;

import com.selocambio.entities.OfertaModel;
import com.selocambio.services.OfertaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}

