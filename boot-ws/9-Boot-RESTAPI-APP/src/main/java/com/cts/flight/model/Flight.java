package com.cts.flight.model;

import java.time.LocalDate;

public class Flight {

	private int id;
	private String name;
	private LocalDate flightDate;

	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public Flight(int id, String name, LocalDate flightDate) {
		super();
		this.id = id;
		this.name = name;
		this.flightDate = flightDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}

}
