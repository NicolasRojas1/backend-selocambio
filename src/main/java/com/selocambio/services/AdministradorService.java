package com.selocambio.services;

import com.selocambio.entities.AdministradorModel;
import com.selocambio.repositories.AdministradorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<AdministradorModel> buscarAdminPorId(String id) {
        return administradorRepository.buscarAdminPorId(id);
    }

    public List<AdministradorModel> buscarAdmin() {
        return administradorRepository.buscarAdmin();
    }

    public String validarLogin(String dni, String password, String codigo){
        List<AdministradorModel> admin = administradorRepository.validarLogin(dni, password, codigo);
        if (admin.size() > 0){
            AdministradorModel administrador = admin.get(0);
            if (administrador.getDni().equals(dni) && administrador.getPassword().equals(password) && administrador.getCodigo().equals(codigo)){
                return "Haz iniciado sesión como " + administrador.getNombre() + ".";
            }
        }
        return "No tienes una cuenta registrada";
    }

}

