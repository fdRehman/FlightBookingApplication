package com.example.FlightBookingApplication.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.FlightBookingApplication.Entity.Flight;
import com.example.FlightBookingApplication.repository.FlightRepository;

@Service
@Component
public class FlightService {
	@Autowired
	FlightRepository flightrepository;

	 public List<Flight> getAllFlightfromSourcetoDestination(String source ,String destination){
		 return flightrepository.getAllflightlist().stream().filter(item->item.getSource().equalsIgnoreCase(source)
				 && item.getDestination().equalsIgnoreCase(destination)).collect(Collectors.toList());
	 }
}

