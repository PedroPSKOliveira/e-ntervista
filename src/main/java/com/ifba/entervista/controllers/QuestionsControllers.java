package com.ifba.entervista.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuestionsControllers {


	@GetMapping("/questions")
	public ModelAndView index() {
		ModelAndView questions = new ModelAndView();
		questions.setViewName("questions/register_questions");
		return questions;
	}
}
