package external;

import java.io.File;
import java.io.FileNotFoundException;

import hu.elte.txtuml.api.model.external.ExternalClass;

public interface ScannerInterface extends ExternalClass{
	public void scanner(File file);
	public boolean hasNext();
	public boolean hasNext(String pattern);
	public boolean hasNextInt(int radix);
	public boolean hasNextInt();
	public boolean hasNextLine();
	public String next();
	public int nextInt();
	public int nextInt(int radix);
	public String nextLine();
	public String toString();
	public void remove();
	
}
