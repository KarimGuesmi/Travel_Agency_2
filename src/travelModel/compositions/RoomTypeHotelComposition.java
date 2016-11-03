package travelModel.compositions;

import hu.elte.txtuml.api.model.Composition;
import hu.elte.txtuml.api.model.Association.Many;
import hu.elte.txtuml.api.model.Composition.Container;
import travelModel.Hotel;
import travelModel.RoomType;


public class RoomTypeHotelComposition extends Composition{
	class hotel extends Container<Hotel>{
	}
	
	class roomType extends Some<RoomType>{
	}
}
