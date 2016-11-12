package travelModelClassDiagram;

import java.util.Timer;

import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;
import travelModel.Customer;
import travelModel.Hotel;
import travelModel.associations.HotelBooking;
import travelModel.signals.DoReservation;
import travelModel.signals.OnBooking;

public class Tester {
	static void init() {
		Hotel h = Action.create(Hotel.class, 1);
		Customer c1 = Action.create(Customer.class, 1, "customer1");
		Customer c2 = Action.create(Customer.class, 2, "customr2");
		Customer c3 = Action.create(Customer.class, 3, "customr3");
		Customer c4 = Action.create(Customer.class, 4, "customr4");
		
		Action.link(HotelBooking.hotel.class, h, HotelBooking.customer.class, c1);
		Action.link(HotelBooking.hotel.class, h, HotelBooking.customer.class, c2);
		Action.link(HotelBooking.hotel.class, h, HotelBooking.customer.class, c3);
		Action.link(HotelBooking.hotel.class, h, HotelBooking.customer.class, c4);
		
		
		Action.log("Hotel and Customers are starting.");
		Action.start(h);
		Action.start(c1);
		Action.start(c2);
		Action.start(c3);
		Action.start(c4);
		
		Action.log("One of the customers is starting to Booking in Hotel");
		
		Customer oneOftheCustomers = h.assoc(HotelBooking.customer.class).selectAny();
		Action.send(new DoReservation(), oneOftheCustomers);
		hu.elte.txtuml.api.stdlib.timers.Timer.start(oneOftheCustomers, new DoReservation(), 2000);
		
		Action.log("Second customer is starting to Booking in Hotel");
		
		Customer oneOftheCustomers2 = h.assoc(HotelBooking.customer.class).selectAny();
		Action.send(new DoReservation(), oneOftheCustomers2);
		hu.elte.txtuml.api.stdlib.timers.Timer.start(oneOftheCustomers2, new DoReservation(), 2000);
	
		Action.log("Second customer is starting to Booking in Hotel");
		/*
		Customer oneOftheCustomers3 = h.assoc(HotelBooking.customer.class).selectAny();
		Action.send(new DoReservation(), oneOftheCustomers3);
		hu.elte.txtuml.api.stdlib.timers.Timer.start(oneOftheCustomers3, new DoReservation(), 2000);
		Action.log("Second customer is starting to Booking in Hotel");
		
		Customer oneOftheCustomers4 = h.assoc(HotelBooking.customer.class).selectAny();
		Action.send(new DoReservation(), oneOftheCustomers4);
		hu.elte.txtuml.api.stdlib.timers.Timer.start(oneOftheCustomers4, new DoReservation(), 2000);
		*/
	}
	
	
	public static void main(String[] args) {
		ModelExecutor.create().setTraceLogging(true).run(Tester::init);

	}

}
