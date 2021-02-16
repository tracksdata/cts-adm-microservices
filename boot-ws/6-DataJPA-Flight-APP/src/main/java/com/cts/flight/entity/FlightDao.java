package com.cts.flight.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightDao extends JpaRepository<Flight, Integer>{
	
	Flight findFlightByFlightDateAndOriginAndDestinationAndFlightNumber(LocalDate flightDate,String origin,String destination,String FlightNumber);
	List<Flight> findFlightByOriginAndDestinationAndFlightDate(String origin,String destination,LocalDate flightDate);
}
