package com.ifba.entervista.controllers;

import com.ifba.entervista.dao.AreaDAO;
import com.ifba.entervista.model.Area;
import com.ifba.entervista.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class AreaControllers {
    @Autowired
    private AreaDAO areaDAO;

    @GetMapping(value = "/area")
    public ModelAndView index() {
        ModelAndView home = new ModelAndView();
        home.setViewName("area/area");
        home.addObject("area", new Area());
        return home;
    }


    @PostMapping(value = "/saveArea")
    public ModelAndView saveArea(Area area) {
        ModelAndView home = new ModelAndView("redirect:/area");
        //verify if the email is already in the database
        if(areaDAO.findByNome(area.getNome()) == null) {
            areaDAO.save(area);
            return home;
        }
            return home;

    }

    @GetMapping(value = "/findArea")
    public ModelAndView findArea(Model model){
        ModelAndView area = new ModelAndView();
        area.setViewName("area/list_area");
        List areas = areaDAO.findAll();
        model.addAttribute("area", areas);
        return area;
    }

    @GetMapping(value = "/findAreaToEdit")
    public ModelAndView findAreaToEdit(long id) {
        ModelAndView areas = new ModelAndView("area/edit_area");
        Area area = areaDAO.findAreaById(id);
        areas.addObject("area", area);
        return areas;
    }

    @PostMapping(value = "/edit_area")
    public ModelAndView editArea(Model model, Area area){
        ModelAndView areas = new ModelAndView();
        areaDAO.save(area);
        areas.setViewName("redirect:/findArea");
        List a = areaDAO.findAll();
        model.addAttribute("area", a);
        return areas;
    }

    @GetMapping(value = "/delete_area")
    public ModelAndView deleteArea(Model model, long id){
        ModelAndView areas = new ModelAndView();
        areaDAO.deleteById(id);
        areas.setViewName("redirect:/findArea");
        List a = areaDAO.findAll();
        model.addAttribute("area", a);
        return areas;
    }

}
