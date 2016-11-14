package external;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerImplementation implements ScannerInterface{

	@Override
	public void readID(HotelObject hotel) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter id of the hotel");
	    int hotel_ID = sc.nextInt();
		hotel.setHotel_id(hotel_ID);
		
	}

	@Override
	public void readName(HotelObject hotel) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the NAME of the hotel");
		String hotel_Name = sc.next();
		hotel.setHotel_name(hotel_Name);
		
	}



	
	@Override
	public void readCategory(HotelObject hotel) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the CATEGORY of the hotel");
	    String  hotel_Category = sc.next();
		hotel.setHotel_category(hotel_Category);
		
	}

	@Override
	public void readPhone(HotelObject hotel) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the PHONE of the hotel");
	    String hotel_Phone = sc.next();
		hotel.setHotel_phone(hotel_Phone);
		
		
	}

	@Override
	public void readEmail(HotelObject hotel) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the EMAIL of the hotel");
	    String hotel_Email = sc.next();
		hotel.setHotel_email(hotel_Email);
		
		
	}

	@Override
	public void readDescription(HotelObject hotel) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the Description of the hotel");
	    String hotel_Description = sc.next();
		hotel.setHotel_description(hotel_Description);
		
		
	}

	@Override
	public void readHotelType(HotelObject hotel) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the Type of the hotel");
	    String hotel_Type = sc.next();
		hotel.setHotel_type(hotel_Type);
			
	}
	
	public void display(HotelObject hotel){
		System.out.println("Your entered id is :"+hotel.getHotel_id());
		System.out.println("Your enterend name is :"+hotel.getHotel_name());
		System.out.println("Your entered id is :"+hotel.getHotel_category());
		System.out.println("Your entered id is :"+hotel.getHotel_phone());
		System.out.println("Your entered id is :"+hotel.getHotel_email());
		System.out.println("Your entered id is :"+hotel.getHotel_description());
		System.out.println("Your entered id is :"+hotel.getHotel_type());
	}

	@Override
	public void readFromFile(HotelObject hotel) throws FileNotFoundException {
		File file = new File("hotelData.txt");
		try
			{	
				Scanner sc = new Scanner(file);
				
				int hotel_id = Integer.parseInt(sc.nextLine()) ;
				hotel.setHotel_id(hotel_id);
				
				String hotel_name = sc.nextLine();
				hotel.setHotel_name(hotel_name);

				String hotel_cat = sc.nextLine();
				hotel.setHotel_category(hotel_cat);

				String hotel_adr = sc.nextLine();
				hotel.setHotel_adress(hotel_adr);
				
				String hotel_phone = sc.nextLine();
				hotel.setHotel_phone(hotel_phone);
				
				String hotel_mail = sc.nextLine();
				hotel.setHotel_email(hotel_mail);
				
				String hotel_desc = sc.nextLine();
				hotel.setHotel_description(hotel_desc);

				String hotel_type = sc.nextLine();
				hotel.setHotel_type(hotel_type);
				
				System.out.println(hotel.getHotel_id());
				System.out.println(hotel.getHotel_name());
				System.out.println(hotel.getHotel_category());
				System.out.println(hotel.getHotel_phone());
				System.out.println(hotel.getHotel_email());
				System.out.println(hotel.getHotel_description());
				System.out.println(hotel.getHotel_type());




				
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}