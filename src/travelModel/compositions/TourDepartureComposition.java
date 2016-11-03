package travelModel.compositions;

import hu.elte.txtuml.api.model.Composition;
import hu.elte.txtuml.api.model.Association.Many;
import hu.elte.txtuml.api.model.Composition.Container;
import travelModel.Departure;
import travelModel.Tour;


public class TourDepartureComposition extends Composition{
	class tour extends Container<Tour>{
		
	}
	
	class departure extends Some<Departure>{
		
	}
}
