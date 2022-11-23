package com.ifba.entervista.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "area")
@RequiredArgsConstructor
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idArea")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    public Area(Long id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
