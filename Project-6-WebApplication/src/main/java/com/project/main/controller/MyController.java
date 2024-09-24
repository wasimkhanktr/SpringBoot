package com.project.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.main.entities.User;
import com.project.main.service.UserService;

@Controller
public class MyController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/regPage")
	public String openRegPage(Model model)
	{
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/regForm")
	public String submitForm(@ModelAttribute("user") User user,Model model)
	{
		boolean status = userService.registerUser(user);
		
		if(status)
			model.addAttribute("successMessege", "User Register Successfully");
		else
			model.addAttribute("errMessege", "User Register failled");
			
		return "register";
		
	}
}
