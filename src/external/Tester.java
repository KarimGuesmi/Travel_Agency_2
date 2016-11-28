package external;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args)  {
		Scanner sc;
		ScannerImpl sImp = new ScannerImpl();
		
		String path = "hotelData.txt";
		
		File file = new File("hotelData.txt");
		sImp.scanner(file);
		
		System.out.println(sImp.nextInt());
		
	}
}