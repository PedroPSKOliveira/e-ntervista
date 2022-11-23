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
		ModelAndView home = new ModelAndView("redirect:/home");
		//verify if the email is already in the database
		if(!candidatoRepo.existsByEmail(candidato.getEmail())) {
			candidatoRepo.save(candidato);
			return home;
		}
		// redirect to home
			return home;

		// redirect to home
		// return new ModelAndView("redirect:/home");
	}

}