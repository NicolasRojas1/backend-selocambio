package com.selocambio.services;

import com.selocambio.entities.AdministradorModel;
import com.selocambio.repositories.AdministradorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorService {

    AdministradorRepository administradorRepository;

    public AdministradorService(AdministradorRepository administradorRepository) {
        this.administradorRepository = administradorRepository;
    }

    public Object crearAdministrador (AdministradorModel administradorModel) {
        return administradorRepository.save(administradorModel);
    }

    public List<AdministradorModel> buscarAdminNombre(String nombre) {
        return administradorRepository.buscarPorNombre(nombre);
    }

}

