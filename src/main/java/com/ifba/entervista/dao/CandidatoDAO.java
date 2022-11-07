package com.ifba.entervista.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ifba.entervista.model.Candidato;

@Repository
public interface CandidatoDAO  extends JpaRepository<Candidato, Long> {
    
}