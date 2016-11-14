package external;

import java.io.FileNotFoundException;

public interface ScannerInterface {
	public void readID(HotelObject hotel);
	public void readName(HotelObject hotel);
	public void readCategory(HotelObject hotel);
	public void readPhone(HotelObject hotel);
	public void readEmail(HotelObject hotel);
	public void readDescription(HotelObject hotel);
	public void readHotelType(HotelObject hotel);
	public void display(HotelObject hotel);
	
	public void readFromFile(HotelObject hotel) throws FileNotFoundException ;
}
