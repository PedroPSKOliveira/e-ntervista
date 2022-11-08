package com.ifba.entervista.services;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifba.entervista.dao.UserDAO;
import com.ifba.entervista.util.Util;

@Service
public class ServiceUser {
    
    @Autowired
    public static UserDAO userDAO;

    public static void saveUser(com.ifba.entervista.model.User user) throws NoSuchAlgorithmException {
        // verify if the username is null
        if(userDAO.findByUsername(user.getUsername()) == null) {
            // verify if the email is null
            if(userDAO.findByEmail(user.getEmail()) == null) {
                // encrypt password
                String pass = Util.Kripto(user.getPassword());
                // set password krifpted
                user.setPassword(pass);
                // save user
                userDAO.save(user);
            }
        }
    }
}