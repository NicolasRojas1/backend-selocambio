package com.selocambio.controller;

import com.selocambio.entities.AdministradorModel;
import com.selocambio.services.AdministradorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/admin")
public class AdministradorController {

    AdministradorService administradorService;

    public AdministradorController(AdministradorService administradorService) {
        this.administradorService = administradorService;
    }

    List<AdministradorModel> administradorModels = new ArrayList<>();

    @PostMapping("/guardar-admin")

    public Object guardarAdmin(@RequestBody AdministradorModel a)
    {
        return administradorService.crearAdministrador(a);
    }



}