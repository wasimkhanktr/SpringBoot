package com.project.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyControllers {
	
	@GetMapping("/")
	@ResponseBody
	public String printHello()
	{
		return "hello world";
	}

}
