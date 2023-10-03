package com.csis3275.controller_numbertwo_group;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.models_numbertwo_group.Home_Model;

// Home page controller
// Displays 3 link/buttons to team member's personal pages and a group description
// Root directory

@Controller
public class Controller_NumberTwo_Group {
	
	@GetMapping("/")
	public String homePage_NumberTwo(Model model) {
		model.addAttribute("home_model", new Home_Model());
		return "home";
	}
}
