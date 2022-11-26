package com.ifba.entervista.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "area")
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idArea", nullable = false)
    private long id;

    @Column(name = "nombre")
    private String nome;

    public Area(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Area(){

    }
}
