package travelModel.associations;

import hu.elte.txtuml.api.model.Association;
import hu.elte.txtuml.api.model.Association.One;
import travelModel.Customer;
import travelModel.Hotel;

public class HotelBooking extends Association{
	
	public class hotel extends Some<Hotel>{	
	}
	
	public class customer extends Some<Customer>{	
	}
	
	
}
