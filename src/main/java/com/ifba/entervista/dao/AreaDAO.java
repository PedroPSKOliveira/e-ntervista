package com.ifba.entervista.dao;

import com.ifba.entervista.model.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaDAO extends JpaRepository<Area, Long> {

    Object findById(long id);
    Object findByNombre(String nombre);
    List<Area> findAll();

    void deleteById(Long id);

}
