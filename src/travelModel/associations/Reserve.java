package travelModel.associations;

import hu.elte.txtuml.api.model.Association;
import hu.elte.txtuml.api.model.Association.Many;
import hu.elte.txtuml.api.model.Association.One;
import travelModel.Customer;
import travelModel.Reservation;
import travelModel.RoomReservation;

public class Reserve extends Association{
	class customer extends One<Customer>{	
	}
	
	class rooomReservation extends Many<RoomReservation>{	
	}
}
