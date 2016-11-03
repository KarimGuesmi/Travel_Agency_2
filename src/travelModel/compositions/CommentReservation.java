package travelModel.compositions;

import hu.elte.txtuml.api.model.Composition;
import hu.elte.txtuml.api.model.Association.Many;
import hu.elte.txtuml.api.model.Composition.Container;
import travelModel.Comment;
import travelModel.Reservation;

public class CommentReservation extends Composition{
	class reservation extends Container<Reservation>{	
	}
	
	class comment extends Many<Comment>{
	}
}
