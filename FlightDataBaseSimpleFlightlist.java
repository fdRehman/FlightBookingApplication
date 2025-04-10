package com.example.FlightBookingApplication.Database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.FlightBookingApplication.Entity.Flight;
@Component
public class SimpleFlightList implements FlightList{
	List<Flight> listofflight=new ArrayList<Flight>();

	
	public SimpleFlightList() {
		listofflight.add(new Flight("FL001","LA","Stockholm"));
		listofflight.add(new Flight("FL002","LA","Stockholm"));
		listofflight.add(new Flight("FL003","Delhi","Bengluru"));
		listofflight.add(new Flight("FL004","Sydney","Miami"));
		listofflight.add(new Flight("FL005","Wales","Cambridge"));
		listofflight.add(new Flight("FL006","Michigan","Dallas"));
		listofflight.add(new Flight("FL007","Bombay","Kochi"));
		listofflight.add(new Flight("FL008","Dallas","Stockholms"));
		listofflight.add(new Flight("FL009","NewYork","Stockholms"));
		listofflight.add(new Flight("FL011","Pune","Agra"));
	}

	@Override
	public List<Flight> getAllFlights() {
		return this.listofflight;
	}

}

