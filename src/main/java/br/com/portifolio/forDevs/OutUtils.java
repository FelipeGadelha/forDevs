package br.com.portifolio.forDevs;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

public class OutUtils {

	public static void writePeoples(String file, String extension, List<People> peoples) throws FileNotFoundException {
		
		PrintStream ps = new PrintStream(file + extension);
		ps.println(People.header());
		peoples.forEach(p -> ps.println(p));
		ps.close();
		
	}
	
	
	
}
