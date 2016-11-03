package travelModel.compositions;

import hu.elte.txtuml.api.model.Composition;
import hu.elte.txtuml.api.model.Association.Many;
import hu.elte.txtuml.api.model.Composition.Container;
import travelModel.Reservation;
import travelModel.RoomReservation;

public class ReservationRoomReservationComposition extends Composition{
	class reservation extends Container<Reservation>{
	}
	
	class roomReservation extends Many<RoomReservation>{
	}
}
