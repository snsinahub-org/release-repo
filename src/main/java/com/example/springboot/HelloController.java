package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// A rest controller
@RestController
public class HelloController {

	// Wow this one needed a comment
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}