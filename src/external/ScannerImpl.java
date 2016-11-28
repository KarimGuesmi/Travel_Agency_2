package external;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScannerImpl implements ScannerInterface{
	Scanner sc;
	
	@Override
	public void scanner(File file) {
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean hasNext() {
		return sc.hasNext();
	}

	@Override
	public boolean hasNext(String pattern) {
		return sc.hasNext(pattern);
	}

	@Override
	public boolean hasNextInt(int radix) {
		return sc.hasNextInt();
	}

	@Override
	public boolean hasNextLine() {
		return sc.hasNextLine();
	}

	@Override
	public String next() {
		return sc.next();
	}

	@Override
	public int nextInt() {
		return sc.nextInt();
	}

	@Override
	public int nextInt(int radix) {
		return sc.nextInt(radix);
	}

	@Override
	public String nextLine() {
		return sc.nextLine();
	}

	@Override
	public void remove() {
		sc.remove();
	}

	@Override
	public boolean hasNextInt() {
		return sc.hasNextInt();
	}

	public void reset(){
		sc.reset();
	}

	@Override
	public String findInLine(String pattern) {
		return sc.findInLine(pattern);
	}

	//java doc: short documentation about this class and methods
	//long documentation to be summerized into short
	// package names : hu.elte.txtuml.stdlib<subpackage> => original jsvs package name
	// for methods names : clashing with txtyml reserved words : extends the name according to the semantics
	
}