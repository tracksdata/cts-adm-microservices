package com.cts.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.flight.dao.FlightDao;
import com.cts.flight.entity.Flight;

@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightDao flightDao;
	
	@Override
	public List<Flight> findAll(){
		return flightDao.findAll();
	}
	

}
