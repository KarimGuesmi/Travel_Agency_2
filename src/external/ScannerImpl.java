package external;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScannerImpl implements ScannerInterface{
	Scanner sc;
	
	@Override
	public void scanner(File source) {
		try {
			sc = new Scanner(source);
		} catch (FileNotFoundException e) {
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
	
}