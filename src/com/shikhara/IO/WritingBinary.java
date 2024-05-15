package com.shikhara.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingBinary {

	public static void main(String[] args) {
String fileName = "myFile.bin";
		
		try {
			FileOutputStream os = new FileOutputStream(fileName);
			ObjectOutputStream ob = new ObjectOutputStream(os);
			
			ob.writeInt(2048);;
			ob.close();
			System.out.println("File updated");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}
	}

