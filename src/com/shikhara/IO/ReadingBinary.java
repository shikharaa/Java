package com.shikhara.IO;

import java.io.*;

public class ReadingBinary {

	public static void main(String[] args) {
		
		String fileName = "myFile.bin";
		
		
			FileInputStream os1;
			try {
				os1 = new FileInputStream(fileName);
				ObjectInputStream ob1 = new ObjectInputStream(os1);
				int x = ob1.readInt();
				ob1.close();
				System.out.println(x);
				System.out.println("Reading complete");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			

	}

}
