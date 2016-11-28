package hu.elte.txtuml.stdlib.util;

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
		
		System.out.println(sImp.hasNextInt(100344));
		
		System.out.println(sImp.hasNext());
		
		sImp.reset();
		System.out.println("**********************");
		while(sImp.hasNext()){
			System.out.println(sImp.next());
		}
		
		System.out.println(sImp.findInLine("hotel_type_1"));
		
		
	}
}