package com.cts.flight.model;

import java.time.LocalDate;

public class SearchQuery {

	private String flightNumber;
	private String origin;
	private String destination;
	private LocalDate flightDate;
	private int numberofPassengers;

	public SearchQuery() {
		// TODO Auto-generated constructor stub
	}

	public SearchQuery(String flightNumber, String origin, String destination, LocalDate flightDate) {
		super();
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.flightDate = flightDate;
	}

	public SearchQuery(String origin, String destination, LocalDate flightDate) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.flightDate = flightDate;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}

	public int getNumberofPassengers() {
		return numberofPassengers;
	}

	public void setNumberofPassengers(int numberofPassengers) {
		this.numberofPassengers = numberofPassengers;
	}

}
