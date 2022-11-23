package com.ifba.entervista.controllers;

import com.ifba.entervista.dao.AreaDAO;
import com.ifba.entervista.model.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AreaControllers {
    @Autowired
    private AreaDAO areaRepo;
    Area a = new Area();

    @GetMapping(value = "/area")
    public ModelAndView index() {
        ModelAndView home = new ModelAndView();
        home.setViewName("home/index");
        home.addObject("area", new Area());
        return home;
    }

    @PostMapping(value = "/saveArea")
    public ModelAndView saveCand(Area area) {
        ModelAndView home = new ModelAndView("redirect:/home");
        //verify if the email is already in the database
        if(areaRepo.findByNombre(a.getNombre()) == null) {
            areaRepo.save(area);
            return home;
        }else {
            // redirect to home
            return home;
        }
        // redirect to home
        // return new ModelAndView("redirect:/home");
    }


}
