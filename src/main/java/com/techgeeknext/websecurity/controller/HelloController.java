package com.techgeeknext.websecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {
	
	@GetMapping("/hello/user")
	public String sayHello(@RequestParam(required = false,defaultValue = "TechGeekNext User") String name, Principal principal) {
		return name+" : You are logged in as <b><u>"+principal.getName()+"</b></u>";
	}
}
