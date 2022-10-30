package com.ifba.entervista.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

// import com.ifba.entervista.dao.UserDAO;
import com.ifba.entervista.model.User;

@RestController
public class LoginControllers {
	

	@GetMapping("/")
	public ModelAndView login() {
		ModelAndView login = new ModelAndView();
		login.addObject("user", new User());
		login.setViewName("login/login");
		return login;
	}
}
