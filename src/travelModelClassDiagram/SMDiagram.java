package travelModelClassDiagram;

import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.Row;
import hu.elte.txtuml.api.layout.StateMachineDiagram;
import hu.elte.txtuml.api.layout.Diagram.Layout;
import travelModel.Departure;
import travelModel.Departure.Arrive;
import travelModel.Departure.Depart;
import travelModel.Departure.Init;

public class SMDiagram extends StateMachineDiagram<Departure>{
	@Column({Init.class, Depart.class})
	@Row({Depart.class, Arrive.class})
	class L extends Layout{}
}
