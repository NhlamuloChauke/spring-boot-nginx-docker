package com.demo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
	
	@GetMapping(path = "/profile")
	public String HomePage(Model model) {
		return "index";
	}
}
