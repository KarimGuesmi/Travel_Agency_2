package travelModelClassDiagram;

import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.StateMachineDiagram;
import hu.elte.txtuml.api.model.StateMachine.Initial;
import hu.elte.txtuml.api.layout.Diagram.Layout;
import hu.elte.txtuml.api.layout.Row;
import travelModel.Hotel;
import travelModel.Hotel.Check_Bookings;
import travelModel.Hotel.Check_Places;
import travelModel.Hotel.Find_Other_Dates;
import travelModel.Hotel.Init;
import travelModel.Hotel.Receive_Customer;
import travelModel.Hotel.Reservatt;
import travelModel.Hotel.Validate;
import travelModel.Reservation;


public class HotelSMDiagram extends StateMachineDiagram<Hotel>{
	@Row({Init.class, Receive_Customer.class})
	
	@Column({Init.class, Reservatt.class})
	@Column({Reservatt.class, Check_Places.class})
	@Column({Check_Places.class, Find_Other_Dates.class})
	
	@Column({Receive_Customer.class, Check_Bookings.class})
	@Column({Check_Bookings.class, Validate.class})
	class L extends Layout{}
}
