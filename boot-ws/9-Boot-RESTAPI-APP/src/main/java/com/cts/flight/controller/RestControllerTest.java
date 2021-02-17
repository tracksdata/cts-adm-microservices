package com.cts.flight.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.flight.model.Flight;

@RestController
@CrossOrigin
@RequestMapping("/api/pss")
public class RestControllerTest {
	
	@GetMapping
	public String f1() {
		return "Welcome to Spring boot Rest API";
	}
	
	@GetMapping("/flight")
	public Flight getFlight() {
		return new Flight(10, "AI-876", LocalDate.of(202, 12, 23));
	}
	
	

}
