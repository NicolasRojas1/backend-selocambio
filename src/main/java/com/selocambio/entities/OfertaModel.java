package com.selocambio.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(name = "idoferta")
    private int idOferta;
    @Column(name = "nombrecli")
    private String nombreCli;
    @Column(name = "telefonocli")
    private String telefonoCli;
    @Column(name = "correocli")
    private String correoCli;
    @Column(name = "interescli")
    private String interesCli;
    @Column(name = "nombreprod")
    private String nombreProd;
    @Column(name = "categoriaprod")
    private String categoriaProd;
    @Column(name = "descripcionprod")
    private String descripcionProd;
    @Column(name = "imagenprod")
    private String imagenProd;


    //RELACION MUCHOS A UN ADMIN
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "idadministrador")
    AdministradorModel administradorModel;

}
