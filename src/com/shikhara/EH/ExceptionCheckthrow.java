//checked exception


package com.shikhara.EH;

import java.io.*;

public class ExceptionCheckthrow {
	
	
	static void method() throws FileNotFoundException {
		
		FileReader file = new FileReader("C://shikhara.txt");
		
		 BufferedReader fileInput = new BufferedReader(file); 
		 
		 throw new FileNotFoundException();
		
		
	}
	

	public static void main(String[] args) throws FileNotFoundException {
		
		method();
		
		
		// TODO Auto-generated method stub

	}

}
