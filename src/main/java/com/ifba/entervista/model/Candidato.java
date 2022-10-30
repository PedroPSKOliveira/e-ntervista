package com.ifba.entervista.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "candidato")
public class Candidato {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCandidato")
    private Long id;

    @Column(name = "nombre")
    private String nome;

    @Column(name = "CPF")
    private String CPF;

    @Column(name = "RG")
    private String RG;

    @Column(name = "idArea")
    private Long idArea;

    @Column(name = "dataNascimento")
    private String dataNascimento;

    public Candidato(Long id, String nome, String CPF, String RG, Long idArea, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.idArea = idArea;
        this.dataNascimento = dataNascimento;
    }

    public Candidato() {
    }

    
}

