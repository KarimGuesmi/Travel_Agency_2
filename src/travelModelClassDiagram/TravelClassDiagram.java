package travelModelClassDiagram;

import hu.elte.txtuml.api.layout.ClassDiagram;
import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.Left;
import hu.elte.txtuml.api.layout.Right;
import hu.elte.txtuml.api.layout.Row;
import hu.elte.txtuml.api.model.StateMachine.Transition;
import travelModel.AccomodationChoice;
import travelModel.Comment;
import travelModel.Customer;
import travelModel.Departure;
import travelModel.FlightReservation;
import travelModel.Hotel;
import travelModel.Reservation;
import travelModel.RoomReservation;
import travelModel.RoomType;
import travelModel.Tour;

public class TravelClassDiagram extends ClassDiagram{
	@Row({Tour.class, Departure.class, FlightReservation.class})
	@Column({Tour.class, Hotel.class, RoomType.class})
	@Column({Departure.class, AccomodationChoice.class})
	@Row({Hotel.class, AccomodationChoice.class, Customer.class, Reservation.class})
	@Column({FlightReservation.class, Customer.class, Comment.class})
	@Column({Reservation.class, RoomReservation.class})
	@Right(from=Departure.class, val = FlightReservation.class)
	class TravelLayout extends Layout{}
}
