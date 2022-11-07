package com.ifba.entervista.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ifba.entervista.dao.CandidatoDAO;




@RestController
public class CandidatesControllers{


    @Autowired
    private CandidatoDAO candidatoDAO;
    /**
     * @return
     */
    @GetMapping("/candidates")
    public ModelAndView index() {
        ModelAndView candidates = new ModelAndView();
        candidates.setViewName("candidate/candidates");
        // list all candidates
        candidates.addObject("candidato", candidatoDAO.findAll());
        return candidates;
    }
}
