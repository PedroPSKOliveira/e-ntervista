package com.ifba.entervista.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginControllers {
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView home = new ModelAndView();
		home.setViewName("login/login");
		return home;
	}
}
