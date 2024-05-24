package com.shikhara.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFileWrite {

	public static void main(String[] args) throws IOException {


		FileWriter f = new FileWriter("C:\\Users\\shikh\\Desktop\\Shikhara-Course-Work\\CharFile.txt");
		PrintWriter p =new PrintWriter(f);
		
		for (int i =0;i<=3;i++) {
			
			p.println("Hello, I am Shikhara");
			
		}
		f.close();
		p.close();
		
		System.out.println("Writing complete");

	}

}
