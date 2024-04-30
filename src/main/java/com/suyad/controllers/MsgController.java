package com.suyad.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController
{
	@GetMapping("/welcome")
	public String getWelcome(Model m)
	{
		m.addAttribute("msg", "Welcome to Thymeleaf pages");
		return "index";
	}
	@GetMapping("/greet")
	public String greetingMessage(Model m)
	{
		m.addAttribute("msg", "Good Evening.....");
		return "index";
	}
}
