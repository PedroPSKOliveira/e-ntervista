package com.ifba.entervista.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ifba.entervista.dao.UserDAO;
import com.ifba.entervista.model.User;

@RestController
public class LoginControllers {
	
	@Autowired
	private UserDAO userRepo;

	@GetMapping("/")
	public ModelAndView login() {
		ModelAndView login = new ModelAndView();
		login.addObject("user", new User());
		login.setViewName("login/login");
		return login;
	}

	@PostMapping("/login")
	public ModelAndView login(User user) {
		// check if user exists
		if (userRepo.findByUsername(user.getUsername()) != null) {
			// check if password is correct
			if (((User) userRepo.findByUsername(user.getUsername())).getPassword().equals(user.getPassword())) {
				// redirect to home with user logged
				return new ModelAndView("redirect:/home", "user", user);
			}
		}
		// redirect to home
		return null;
	}
}
