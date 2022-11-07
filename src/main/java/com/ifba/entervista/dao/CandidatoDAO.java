package com.ifba.entervista.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ifba.entervista.model.Candidato;

@Repository
public interface CandidatoDAO  extends JpaRepository<Candidato, Long> {

    // find by id
    Object findById(long id);

    // find by email
    Object findByEmail(String email);

    // findAll
    List<Candidato> findAll();


    
}