package com.cts.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.flight.service.FlightService;

@Controller
public class FlightController {

	@Autowired
	private FlightService flightService;
	
	@RequestMapping(value = "/")
	public String welcome() {
		return "index";
	}
	
	@RequestMapping(value = "/flights")
	public String findAllFlights(Model model){
		model.addAttribute("flights", flightService.findAll());
		return "flights";
	}
	
	
	
	
	
}
