package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pro_2 {
	private String studentName="Hariharan";
	@GetMapping("name")
public String getName()
{
	return "Welcome "+studentName+" !";
}
}
