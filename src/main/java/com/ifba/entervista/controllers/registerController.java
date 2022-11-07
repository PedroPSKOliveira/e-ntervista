package com.ifba.entervista.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ifba.entervista.dao.UserDAO;
import com.ifba.entervista.model.User;


@RestController
public class registerController {
    
    @Autowired
    private UserDAO userRepo;


    @GetMapping("/register")
	public ModelAndView register() {
		ModelAndView register = new ModelAndView();
		register.addObject("user", new User());
		register.setViewName("register/register");
		return register;
	}

    @PostMapping("/registeruser")
    public ModelAndView register(User user) {
        userRepo.save(user);
        return new ModelAndView("redirect:/login");
    }
}
