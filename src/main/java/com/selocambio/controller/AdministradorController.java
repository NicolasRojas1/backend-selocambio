package com.selocambio.controller;

import com.selocambio.entities.AdministradorModel;
import com.selocambio.services.AdministradorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

import java.util.List;
import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdministradorController {

    AdministradorService administradorService;

    public AdministradorController(AdministradorService administradorService) {
        this.administradorService = administradorService;
    }

    List<AdministradorModel> administradorModels = new ArrayList<>();

    @PostMapping("/guardar")

    public Object guardarAdmin(@RequestBody AdministradorModel a)
    {
        return administradorService.crearAdministrador(a);
    }

    @GetMapping("/buscar-nombre/{nombre}")
    public Object obtenerNombre(@PathVariable String nombre){
        return administradorService.buscarAdminNombre(nombre);
    }

    @PostMapping("/login")
    public String validarLogin(@RequestBody Map<String,String> datosLogin){
        String dni, password, codigo;
        dni = datosLogin.get("dni");
        password = datosLogin.get("password");
        codigo = datosLogin.get("codigo");
        return administradorService.validarLogin(dni, password, codigo);
    }

}