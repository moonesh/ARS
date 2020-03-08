package com.ars.flight;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class FlightService {

	public FlightService() {
	}

	@GET
	@Path("/flight/{from}/{to}")
	public String getbookings(@PathParam("from") String from,@PathParam("to") String to ) {
		return "Your flight details from " + from + " to "+ to;
	}

	

}