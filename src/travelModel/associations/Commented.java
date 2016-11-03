package travelModel.associations;

import hu.elte.txtuml.api.model.Association;
import hu.elte.txtuml.api.model.Association.Many;
import hu.elte.txtuml.api.model.Association.One;
import travelModel.Comment;
import travelModel.Customer;

public class Commented extends Association{
	class customer extends One<Customer>{	
	}
	
	class comment extends Many<Comment>{	
	}
}
