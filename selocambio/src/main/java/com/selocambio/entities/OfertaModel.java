package com.selocambio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@Entity(name = "oferta")
@AllArgsConstructor
@NoArgsConstructor

public class OfertaModel {

    private static final long serialVersionUID = 2L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOferta")
    private int idOferta;
    @Column(name = "nombreCli")
    private String nombreCli;
    @Column(name = "telefonocli")
    private String telefonocli;
    @Column(name = "correoCli")
    private String correoCli;
    @Column(name = "interesCli")
    private String interesCli;
    @Column(name = "nombreProd")
    private String nombreProd;
    @Column(name = "categoriaProd")
    private String categoriaProd;
    @Column(name = "descripcionProd")
    private String descripcionProd;
    @Column(name = "imagenProd")
    private String imagenProd;

    //RELACION MUCHOS A UN ADMIN
    @ManyToOne
    @JoinColumn(name = "idAdministrador")
    private AdministradorModel administradorModel;

}
