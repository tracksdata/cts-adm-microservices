package com.cts.flight;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.flight.entity.Flight;
import com.cts.flight.entity.FlightDao;
import com.cts.flight.model.SearchQuery;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		//Flight flight=null;
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		FlightDao flightDao = ac.getBean(FlightDao.class);
		
		/*
		// Find All Flights with fare,inventory and Flight Info
		flightDao.findAll().forEach(flight->{
			System.out.println(flight.getId());
			System.out.println(flight.getOrigin());
			System.out.println(flight.getDestination());
			System.out.println(flight.getFlightNumber());
			System.out.println(flight.getFlightDate());
			System.out.println(flight.getFlightTime());
			System.out.println(flight.getDuration());
			
			// Fare details
			System.out.println(flight.getFare().getFareId());
			System.out.println(flight.getFare().getCurrency());
			System.out.println(flight.getFare().getFare());
			
			// Inventory details
			System.out.println(flight.getInventory().getInvId());
			System.out.println(flight.getInventory().getCount());
			
			//Flight Information
			System.out.println(flight.getFlightInfo().getAirlineInfo().getAirlineId());
			System.out.println(flight.getFlightInfo().getAirlineInfo().getAirlineName());
			System.out.println(flight.getFlightInfo().getAirlineInfo().getAirlineLogo());
			System.out.println(flight.getFlightInfo().getFlightInfoid());
			System.out.println(flight.getFlightInfo().getFlightNumber());
			System.out.println(flight.getFlightInfo().getFlightType());
			System.out.println(flight.getFlightInfo().getSeatCapacity());
			
			System.out.println("---------------------------------------------------------");
			
		});
		
	 */
		
		
		/*
		// Filter flightData by date,origin,destination,flight number -> single flight
		SearchQuery q1=new SearchQuery("2T-518", "DELHI", "CHENNAI", LocalDate.of(2021, 02, 26));
	    flight=flightDao.findFlightByFlightDateAndOriginAndDestinationAndFlightNumber(q1.getFlightDate(), q1.getOrigin(), q1.getDestination(), q1.getFlightNumber());
	    if(flight==null) {
	    	throw new RuntimeException("No Flights Found");
	    }
	    
	    if(flight.getInventory().getCount()<400) {
	    	throw new RuntimeException("No Seats avaible for flight "+flight.getFlightNumber());
	    }
	    	
	    System.out.println(flight.getId());
		System.out.println(flight.getOrigin());
		System.out.println(flight.getDestination());
		System.out.println(flight.getFlightNumber());
		System.out.println(flight.getFlightDate());
		System.out.println(flight.getFlightTime());
		System.out.println(flight.getDuration());
		
		// Fare details
		System.out.println(flight.getFare().getFareId());
		System.out.println(flight.getFare().getCurrency());
		System.out.println(flight.getFare().getFare());
		
		// Inventory details
		System.out.println(flight.getInventory().getInvId());
		System.out.println(flight.getInventory().getCount());
		
		//Flight Information
		System.out.println(flight.getFlightInfo().getAirlineInfo().getAirlineId());
		System.out.println(flight.getFlightInfo().getAirlineInfo().getAirlineName());
		System.out.println(flight.getFlightInfo().getAirlineInfo().getAirlineLogo());
		System.out.println(flight.getFlightInfo().getFlightInfoid());
		System.out.println(flight.getFlightInfo().getFlightNumber());
		System.out.println(flight.getFlightInfo().getFlightType());
		System.out.println(flight.getFlightInfo().getSeatCapacity());
		
		System.out.println("---------------------------------------------------------");
		*/
		// Filter flight data by date,origin,destination and number of passengers -> more flights
		
		SearchQuery q2=new SearchQuery("DELHI", "CHENNAI", LocalDate.of(2021, 02, 26));
		List<Flight> flights= flightDao.findFlightByOriginAndDestinationAndFlightDate(q2.getOrigin(), q2.getDestination(), q2.getFlightDate());
		
		flights=flights.stream().filter(fli->fli.getInventory().getCount()>=21).collect(Collectors.toList());
		
		flights.forEach(flight->{
			System.out.println(flight.getId());
			System.out.println(flight.getOrigin());
			System.out.println(flight.getDestination());
			System.out.println(flight.getFlightNumber());
			System.out.println(flight.getFlightDate());
			System.out.println(flight.getFlightTime());
			System.out.println(flight.getDuration());
			
			// Fare details
			System.out.println(flight.getFare().getFareId());
			System.out.println(flight.getFare().getCurrency());
			System.out.println(flight.getFare().getFare());
			
			// Inventory details
			System.out.println(flight.getInventory().getInvId());
			System.out.println(flight.getInventory().getCount());
			
			//Flight Information
			System.out.println(flight.getFlightInfo().getAirlineInfo().getAirlineId());
			System.out.println(flight.getFlightInfo().getAirlineInfo().getAirlineName());
			System.out.println(flight.getFlightInfo().getAirlineInfo().getAirlineLogo());
			System.out.println(flight.getFlightInfo().getFlightInfoid());
			System.out.println(flight.getFlightInfo().getFlightNumber());
			System.out.println(flight.getFlightInfo().getFlightType());
			System.out.println(flight.getFlightInfo().getSeatCapacity());
			
			System.out.println("---------------------------------------------------------");
			
		});
		
		
	}

}
