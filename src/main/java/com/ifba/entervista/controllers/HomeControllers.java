package com.ifba.entervista.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifba.entervista.models.Candidate;

@Controller
public class HomeControllers {
	
	@GetMapping("/home")
	public ModelAndView index() {
		ModelAndView home = new ModelAndView(Candidate candidate);
		home.setViewName("home/index");
		return home;
	}
}
// alou mundo, dá uma ajuda git