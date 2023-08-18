package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessage {
	@GetMapping("Welcome")
     public String Welcome()
     {
    	 return "Welcome String Boot!";
     }
}
