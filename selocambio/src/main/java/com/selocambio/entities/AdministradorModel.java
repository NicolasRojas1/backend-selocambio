package com.selocambio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "administrador")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdministradorModel {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idadministrador")
    private int idAdministrador;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dni")
    private String dni;
    @Column(name = "edad")
    private String edad;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "correo")
    private String correo;
    @Column(name = "codigo")
    private String codigo;
    @Column (name = "password")
    private String password;


    //RELACION UNO A MUCHOS
   @OneToMany(mappedBy = "administradorModel", cascade = CascadeType.ALL)
    List<OfertaModel> ofertas;

}
