package com.ifba.entervista.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginControllers {
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView login = new ModelAndView();
		login.setViewName("login/login");
		return login;
	}
}
