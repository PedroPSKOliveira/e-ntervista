package com.ifba.entervista.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifba.entervista.model.User;


public interface UserDAO extends JpaRepository<User, Long> {


    // find by email
    String findByEmail(String userName);

    // find by username
    Object findByUsername(String username);

    // find by id
    Object findById(long id);

    // find all
    List<User> findAll();

    // delete by id
    void deleteById(Long id);

}
