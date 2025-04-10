package com.example.FlightBookingApplication.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Flight {
	private String flightno;
	private String source;
	private String destination;
	public Flight(String string, String source, String destination) {
		super();
		this.flightno = string;
		this.source = source;
		this.destination = destination;
	}
	public String getFlightno() {
		return flightno;
	}
	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

}

