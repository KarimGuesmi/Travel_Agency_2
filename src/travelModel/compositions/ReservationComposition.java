package travelModel.compositions;

import hu.elte.txtuml.api.model.Composition;
import travelModel.FlightReservation;
import travelModel.Reservation;

public class ReservationComposition extends Composition{
	class reservation extends Container<Reservation>{
		
	}
	
	class fligthReservation extends Many<FlightReservation>{
		
	}
}
