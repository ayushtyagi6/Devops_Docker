package com.nagarro.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
	
	@GetMapping("/api")
	public String getName() {
		return "Ayush Tyagi";
	}

}
