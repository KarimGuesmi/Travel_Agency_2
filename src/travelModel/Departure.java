package travelModel;

import hu.elte.txtuml.api.model.From;
import hu.elte.txtuml.api.model.ModelClass;
import hu.elte.txtuml.api.model.To;
import hu.elte.txtuml.api.model.Trigger;
import travelModel.signals.OnDeparture;

public class Departure extends ModelClass{
	String departure_date;
	String departure_time;
	String back_date;
	String back_time;
	String seat_available_departure;
	String seat_available_back;
	String departure_place;
	String destination;
	
	
	public class Init extends Initial{}
	
	public class Depart extends State{}
	
	public class Arrive extends State{}
	
	@From(Init.class) @To(Depart.class)
	class Initialize extends Transition{}
	
	@From(Depart.class) @To(Arrive.class) @Trigger(OnDeparture.class)
	class SwitchToArrive extends Transition{}
	
	
	
	// methods
	public void setDate(String dep_date){
		departure_date=dep_date;
	}
}
