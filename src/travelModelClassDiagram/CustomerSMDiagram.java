package travelModelClassDiagram;

import hu.elte.txtuml.api.layout.Row;
import hu.elte.txtuml.api.layout.StateMachineDiagram;
import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.Diagram.Layout;
import travelModel.Customer;
import travelModel.Customer.Check_Date;
import travelModel.Customer.Check_In;
import travelModel.Customer.Check_Out;
import travelModel.Customer.Check_Place;
import travelModel.Customer.DoReserv;
import travelModel.Customer.Init;
import travelModel.Customer.Leave_Hotel;
import travelModel.Customer.Payment;
import travelModel.Customer.Stay;
import travelModel.Customer.Waiting;

public class CustomerSMDiagram extends StateMachineDiagram<Customer>{
	@Row({Init.class, Waiting.class, DoReserv.class})
	
	@Column({Waiting.class, Check_In.class, Check_Out.class, Leave_Hotel.class})
	
	@Column({DoReserv.class, Check_Place.class, Payment.class, Stay.class, Check_Date.class})
	
	class L extends Layout{}
}
