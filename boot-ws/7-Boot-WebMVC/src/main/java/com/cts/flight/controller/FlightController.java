package com.cts.flight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FlightController {

	@RequestMapping("/")
	public String hello(Model model) {
		model.addAttribute("name", "Praveen");
		return "index";
	}
	
	
	
	
}
