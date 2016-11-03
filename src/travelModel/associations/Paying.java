package travelModel.associations;

import hu.elte.txtuml.api.model.Association;
import travelModel.Customer;
import travelModel.Reservation;
import hu.elte.txtuml.api.model.Association.Many;
import hu.elte.txtuml.api.model.Association.One;


public class Paying extends Association{
	class customer extends One<Customer>{	
	}
	
	class reservation extends Many<Reservation>{	
	}
}
