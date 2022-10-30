package com.ifba.entervista.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifba.entervista.model.User;


public interface UserDAO extends JpaRepository<User, Long> {

    String findByEmail(String userName);

}
