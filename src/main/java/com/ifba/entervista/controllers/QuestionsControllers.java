package com.ifba.entervista.controllers;

import com.ifba.entervista.dao.QuestionsDAO;
import com.ifba.entervista.model.Candidato;
import com.ifba.entervista.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class QuestionsControllers {

	@Autowired
	private QuestionsDAO questionsDAO;


	@GetMapping("/questions")
	public ModelAndView index() {
		ModelAndView questions = new ModelAndView();
		questions.setViewName("questions/register_questions");
		questions.addObject("question", new Questions());
		return questions;
	}

	@PostMapping("/saveQuestions")
	public ModelAndView saveQuestions(Questions questions) {
		ModelAndView question = new ModelAndView("redirect:/questions");
			questionsDAO.save(questions);
			return question;
	}


	@GetMapping("/findQuestions")
	public ModelAndView find(Model model){
		ModelAndView question = new ModelAndView();
		question.setViewName("questions/list_questions");
		List questi = questionsDAO.findAll();
		model.addAttribute("perguntas", questi);
		return question;
	}

	@GetMapping("/findToEdit")
	public ModelAndView find(long id) {
		ModelAndView candidates = new ModelAndView("questions/editquestions");
		Questions quest = questionsDAO.findQuestionsById(id);
		candidates.addObject("pergunta", quest);
		return candidates;
	}

	@PostMapping("/editquestions")
	public ModelAndView edit(Model model, Questions questions){
		ModelAndView question = new ModelAndView();
		questionsDAO.save(questions);
		question.setViewName("redirect:/findQuestions");
		List questoes = questionsDAO.findAll();
		model.addAttribute("perguntas", questoes);
		return question;
	}

	@GetMapping("/deleteQuestion")
	public ModelAndView deleteQuestion(Model model, long id){
		ModelAndView question = new ModelAndView();
		questionsDAO.deleteById(id);
		question.setViewName("redirect:/findQuestions");
		List questoes = questionsDAO.findAll();
		model.addAttribute("perguntas", questoes);
		return question;
	}
}
