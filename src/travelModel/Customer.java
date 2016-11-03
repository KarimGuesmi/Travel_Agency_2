package travelModel;

import hu.elte.txtuml.api.model.From;
import hu.elte.txtuml.api.model.ModelClass;
import hu.elte.txtuml.api.model.To;
import hu.elte.txtuml.api.model.Trigger;
import travelModel.signals.DoReservation;

public class Customer extends ModelClass{
	public int    customer_id;
	public String customer_name;
	String customer_date;
	String customer_phone;
	String customer_email;
	
	
	
	public Customer(int customer_id, String customer_name) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;	
	}
	
	public class Init extends Initial{}
	public class Waiting extends State{}
	public class DoReserv extends State{}
	public class Check_Place extends Choice{}
	public class Check_In extends State{}
	public class Payment extends State{}
	public class Stay extends State{}
	public class Check_Date extends Choice{}
	public class Check_Out extends State{}
	public class Leave_Hotel extends State{}
	
	@From(Init.class)
	@To(Waiting.class)
	public class Wait extends Transition{}
	
	@From(Waiting.class)
	@To(DoReserv.class)
	@Trigger(DoReservation.class) // Signal
	public class Reservatio extends Transition{}
	
	@From(DoReserv.class)
	@To(Check_Place.class)
	@Trigger(DoReservation.class)
	public class Check extends Transition{}
	
	@From(Check_Place.class)
	@To(DoReserv.class)
	public class DDDD extends Transition{}
	
	@From(Check_Place.class)
	@To(Check_In.class)
	public class Book extends Transition{}
	
	@From(Check_In.class)
	@To(Payment.class)
	@Trigger(DoReservation.class)
	public class Pay extends Transition{}
	
	@From(Check_Place.class)
	@To(DoReserv.class)
	public class ReservAgain extends Transition{}
	
	@From(Payment.class)
	@To(Stay.class)
	@Trigger(DoReservation.class)
	public class EnterToHotel extends Transition{}
	
	@From(Stay.class)
	@To(Check_Date.class)
	@Trigger(DoReservation.class)
	public class Verify_Date extends Transition{}
	
	@From(Check_Date.class)
	@To(Check_Out.class)
	public class Out extends Transition{}
	
	@From(Check_Out.class)
	@To(Leave_Hotel.class)
	@Trigger(DoReservation.class)
	public class Leave extends Transition{}
	
	@From(Check_Date.class)
	@To(Stay.class)
	public class Back_Stay extends Transition{}
	
	
	
}
