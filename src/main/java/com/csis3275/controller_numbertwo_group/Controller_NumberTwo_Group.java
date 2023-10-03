package com.csis3275.controller_numbertwo_group;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Home page controller
// Displays 3 link/buttons to team member's personal pages and a group description
// Root directory

@Controller
public class Controller_NumberTwo_Group {
	
	@GetMapping("/")
	public String homePage_NumberTwo(Model model) {
		return "home";
	}
}
