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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCandidato", nullable = false)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "ocupacion")
    private String ocupacion;

    @Column(name = "numeroDeTelefono")
    private String numeroDeTelefono;

    @Column(name = "cumpleanos")
    private String cumpleanos;

    @Column(name = "email")
    private String email;

    public Candidato(Long id, String nombre, String apellido, String ocupacion, String numeroDeTelefono,
            String cumpleanos, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.numeroDeTelefono = numeroDeTelefono;
        this.cumpleanos = cumpleanos;
        this.email = email;
    }

    public Candidato() {
    }

    
}

