package external;

public class Tester {

	public static void main(String[] args) {
		HotelObject hotelObject = new HotelObject();
		ScannerImplementation sI = new ScannerImplementation();
		
		sI.readID(hotelObject);
		sI.readName(hotelObject);
		sI.readCategory(hotelObject);
		sI.readDescription(hotelObject);
		sI.readPhone(hotelObject);
		sI.readEmail(hotelObject);
		sI.readHotelType(hotelObject);
		sI.display(hotelObject);
	}

}
