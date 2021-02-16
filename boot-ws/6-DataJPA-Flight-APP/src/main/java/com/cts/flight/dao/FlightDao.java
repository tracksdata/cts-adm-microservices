package com.cts.flight.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.flight.entity.Flight;
import com.cts.flight.entity.FlightInfo;

public interface FlightDao extends JpaRepository<Flight, Integer>{
	
	Flight findFlightByFlightDateAndOriginAndDestinationAndFlightNumber(LocalDate flightDate,String origin,String destination,String FlightNumber);
	List<Flight> findFlightByOriginAndDestinationAndFlightDate(String origin,String destination,LocalDate flightDate);

	@Query(value = "from Flight as f where f.flightDate= :flightDate And f.flightInfo.seatCapacity>=40")
	List<Flight> test123(LocalDate flightDate);
	
	@Query("from Flight")// JPQL
	List<Flight> findFlights();
	
	@Query(value = "from Flight f where f.flightDate  >= :flightDate")
	List<Flight> findFlightsByDate(LocalDate flightDate);
	
	@Query(value = "from Flight as f where f.fare.fare>=:rangeValue")
	List<Flight> flightRange(double rangeValue);
	
	@Query(value = "from Flight f,Inventory i where f.inventory.invId=i.invId")
	List<Flight> multiJoin();
	
	
	
	
	

}
