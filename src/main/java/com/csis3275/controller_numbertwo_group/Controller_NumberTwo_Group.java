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
	
	Student_Model student_nahuel = new Student_Model("/nahuel-profile.jpg", "Nahuel is 36 years old, comes from Argentina and is going throught his last semester at Douglas");
	
	
	@GetMapping("/")
	public String homePage_NumberTwo(Model model) {
		model.addAttribute("home_model", new Home_Model());
		return "home";
	}
	
	@GetMapping("/student/giahuy")
	public String giahuy_progile(Model model) {
		model.addAttribute("giahuy", new Student_Model("/giahuy_selfie.jpg", "Huy has been stuying abroad in Vancouver since 2019, currently is a full time student at Douglas College, also having a part-time job at a small supermarket which mostly import Asian food into Vancouver, Canada"));
		return "student_profiles/giahuy_profile";
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
