package com.selocambio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "oferta")
@Getter
@Setter
@AllArgsConstructor
public class OfertaModel {

    private static final long serialVersionUID = 2L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOferta")
    private int idOferta;
    @Column(name = "NombreCli")
    private String nombreCli;
    private String telefonocli;
    private String correoCli;
    private String interesCli;
    private String nombreProd;
    private String categoriaProd;
    private String descripcionProd;
    private String imagenProd;
}
