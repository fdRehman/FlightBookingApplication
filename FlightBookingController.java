package com.example.FlightBookingApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.FlightBookingApplication.Service.FlightService;
import com.example.FlightBookingApplication.Entity.Flight;
@Controller
public class FlightController {

	@Autowired
	FlightService flightservice;
	
	@RequestMapping
	public String searchFlight() {
		return "search";
	}
	
	@RequestMapping(value="/flightsearchresult", method=RequestMethod.POST)
	public String getSearchFlightResult(@RequestParam("source") String source, @RequestParam("destination") String destination, Model model) {
		List<Flight> listofflight= flightservice.getAllFlightfromSourcetoDestination(source, destination);
	  model.addAttribute("listofsearchflight",listofflight);
	 return "success";
	}
}

