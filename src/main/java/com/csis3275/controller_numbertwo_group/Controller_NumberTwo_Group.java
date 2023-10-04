package com.csis3275.controller_numbertwo_group;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.models_numbertwo_group.Home_Model;
import com.csis3275.models_numbertwo_group.Student_Model;

// Home page controller
// Displays 3 link/buttons to team member's personal pages and a group description
// Root directory

@Controller
public class Controller_NumberTwo_Group {
	
	// Description for testing Purposes
	String description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
			+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
			+ "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
			+ "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
	
	Student_Model student_nahuel = new Student_Model("Nahuel Robledo", description);
	
	
	@GetMapping("/")
	public String homePage_NumberTwo(Model model) {
		model.addAttribute("home_model", new Home_Model());
		return "home";
	}
	
	@GetMapping("/student/nahuel")
	public String nahuel_profile(Model model) {
		model.addAttribute("nahuel", student_nahuel);
		return "student_profiles/nahuel_profile";
	}
	
	@GetMapping("/student/vlad")
	public String vlad_profile(Model model) {
		model.addAttribute("vlad", new Student_Model("/vlad_img.jpg", "Vlad lives in Vancouver where he studies for Computing Studies and IT. He studies at Doulas College, and works at a local New West restaraunt. Recently Vlad got into a card game called Magic The Gathering where he spends all of his money and time. Vlad is very happy to do and especially finish this assignment :)"));
		return "student_profiles/vlad_profile";
	}
	
}
