package travelModel.associations;

import hu.elte.txtuml.api.model.Association;
import travelModel.Departure;
import travelModel.FlightReservation;

public class Tour extends Association{
	class departure extends One<Departure>{	
	}
	
	class flightReservation extends Many<FlightReservation>{	
	}
}
