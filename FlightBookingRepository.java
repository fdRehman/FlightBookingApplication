package com.example.FlightBookingApplication.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.FlightBookingApplication.Database.FlightList;
import com.example.FlightBookingApplication.Entity.Flight;
@Component
public class FlightRepository {
	@Autowired
	FlightList flightlist;
	
	public List<Flight> getAllflightlist() {
		return flightlist.getAllFlights();
	}

}

