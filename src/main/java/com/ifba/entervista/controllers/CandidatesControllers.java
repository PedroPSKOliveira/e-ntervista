package com.ifba.entervista.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ifba.entervista.dao.CandidatoDAO;
// import com.ifba.entervista.model.Candidato;




@RestController
public class CandidatesControllers{


    @Autowired
    private CandidatoDAO candidatoDAO;
    /**
     * @return
     */
    @GetMapping("/candidates")
    public ModelAndView index(Model model) {
        ModelAndView candidates = new ModelAndView();
        candidates.setViewName("candidate/candidates");
        // list all candidates
        List candidatos = candidatoDAO.findAll();
        model.addAttribute("candidato", candidatos);
        return candidates;
    }
}
