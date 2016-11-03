package travelModel;

import hu.elte.txtuml.api.model.From;
import hu.elte.txtuml.api.model.ModelClass;
import hu.elte.txtuml.api.model.To;
import hu.elte.txtuml.api.model.Trigger;
import hu.elte.txtuml.api.model.StateMachine.Initial;
import hu.elte.txtuml.api.model.StateMachine.State;
import hu.elte.txtuml.api.model.StateMachine.Transition;

import travelModel.Departure.Init;
import travelModel.signals.OnBooking;
import travelModel.signals.OnDeparture;

public class Hotel extends ModelClass{
	int hotel_id;
	String hotel_category;
	String hotel_adress;
	String hotel_phone;
	String hotel_email;
	String hotel_name;
	String hotel_description;
	String hotel_images;
	String hotel_type;
	
	public Hotel(int hotel_id) {
		super();
		this.hotel_id = hotel_id;
	}

	public class Init extends Initial{}
	public class Receive_Customer extends State{}
	public class Check_Bookings extends Choice{}
	public class Validate extends State{}
	public class Reservatt extends State{}
	public class Check_Places extends Choice{}
	public class Find_Other_Dates extends State{}
	
	
	@From(Init.class)
	@To(Receive_Customer.class)
	public class Initialize extends Transition{}
	
	@From(Receive_Customer.class)
	@To(Check_Bookings.class)
	@Trigger(OnBooking.class)
	public class Check extends Transition{}
	
	@From(Check_Bookings.class)
	@To(Validate.class)
	public class Validation extends Transition{}
	
	@From(Validate.class)
	@To(Receive_Customer.class)
	@Trigger(OnBooking.class)
	public class Receive extends Transition{}
	
	@From(Check_Bookings.class)
	@To(Reservatt.class)
	public class Reservate extends Transition{}

	@From(Reservatt.class)
	@To(Check_Places.class)
	@Trigger(OnBooking.class)
	public class Verif extends Transition{}
	
	@From(Check_Places.class)
	@To(Find_Other_Dates.class)
	public class FindOtherDte extends Transition{}
	
	@From(Check_Places.class)
	@To(Validate.class)
	public class ValidOK extends Transition{}
	
}