//createNewFile() - To create new file 
//.getName() - To get name of the file
//file gets created in the root level

package com.shikhara.IO;

import java.io.*;
import java.util.Scanner;

public class ReadingTxt {

	public static void main(String[] args) {
		
		File myFile = new File("MyFile.txt");
		Scanner r = null;
		boolean isFile = false;
		
		try {
			if(isFile = myFile.createNewFile()) {
				
				System.out.println("File created: " + myFile.getName());
				
			} /*
				 * else{ System.out.println("File already exists:" + myFile.getName()); }
				 */
			
			 r = new Scanner(myFile);
			while(r.hasNextLine()) {
				String data = r.nextLine();
				System.out.println(data);
			}
			
		} catch (IOException e) {
			System.out.println("Error in Reading the file");
			e.printStackTrace();
		}finally {
			
			r.close();
		}
		

	}

}
