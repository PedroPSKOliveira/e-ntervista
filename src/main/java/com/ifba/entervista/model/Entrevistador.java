package com.ifba.entervista.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "entrevistador")
public class Entrevistador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEntrevistador")
    private Long id;

    @Column(name = "nombre")
    private String nome;

    @Column(name = "CPF")
    private String CPF;

    @Column(name = "RG")
    private String RG;

    @Column(name = "dataNascimento")
    private Date dataNascimento;

    @Column(name = "matricula")
    private static int matricula;

    public Entrevistador(Long id, String nome, String CPF, String RG, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.dataNascimento = dataNascimento;
    }
    
    public Entrevistador() {
    }
}
