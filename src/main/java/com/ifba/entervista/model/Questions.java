package com.ifba.entervista.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "perguntas")
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPeguntas", nullable = false)
    private long id;

    @Column(name = "Perguntas")
    private String Perguntas;


    public Questions(long id, String Perguntas){
        this.id = id;
        this.Perguntas = Perguntas;
    }

    public Questions() {

    }

}
