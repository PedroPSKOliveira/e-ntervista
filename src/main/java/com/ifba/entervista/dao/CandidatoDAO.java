package com.ifba.entervista.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ifba.entervista.model.Candidato;

@Repository
public interface CandidatoDAO  extends JpaRepository<Candidato, Long> {

    Object findByEmail(String email);

    List<Candidato> findAll();
    
}