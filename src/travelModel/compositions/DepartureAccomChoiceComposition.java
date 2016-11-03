package travelModel.compositions;

import hu.elte.txtuml.api.model.Association.Many;
import hu.elte.txtuml.api.model.Composition;
import hu.elte.txtuml.api.model.Composition.Container;
import travelModel.AccomodationChoice;
import travelModel.Departure;

public class DepartureAccomChoiceComposition extends Composition{
	class departure extends Container<Departure>{
	}
	
	class accomChoice extends Some<AccomodationChoice>{
	}
}
