package com.demo.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping(path = "message")
	public String test() {
		return "Hello Spring Boot Docker Nginx";
	}

}
