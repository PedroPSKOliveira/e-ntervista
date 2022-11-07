package com.ifba.entervista.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ifba.entervista.dao.CandidatoDAO;
import com.ifba.entervista.model.Candidato;

@RestController
public class HomeControllers {
	
	@Autowired
	private CandidatoDAO candidatoRepo;


	@GetMapping("/home")
	public ModelAndView index() {
		ModelAndView home = new ModelAndView();
		home.setViewName("home/index");
		home.addObject("candidato", new Candidato());
		return home;
	}

	@PostMapping("/saveCandidato")
	public ModelAndView saveCand(Candidato candidato) {
		candidatoRepo.save(candidato);
		// redirect to home
		return new ModelAndView("redirect:/home");
	}

}