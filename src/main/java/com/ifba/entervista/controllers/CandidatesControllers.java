package com.ifba.entervista.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CandidatesControllers {

    @GetMapping("/candidates")
    public ModelAndView index() {
        ModelAndView candidates = new ModelAndView();
        candidates.setViewName("candidate/candidates");
        return candidates;
    }
}
