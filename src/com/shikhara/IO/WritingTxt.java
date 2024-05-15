package com.shikhara.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingTxt {

	public static void main(String[] args) {
		
		File myFile = new File("MyFile.txt");
		boolean isFile = false;
		
		try {
			if(isFile = myFile.createNewFile()) {
				
				System.out.println("File created: " + myFile.getName());
				
			} /*
				 * else{ System.out.println("File already exists:" + myFile.getName()); }
				 */
			
			FileWriter w = new FileWriter(myFile);
			w.write("I am writing to my file via program");
			w.close();
			System.out.println("File updated");
			
		} catch (IOException e) {
			System.out.println("Error in Reading the file");
			e.printStackTrace();
		}
	}

}
