package com.shikhara.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharByTextFile {

	public static void main(String[] args) throws IOException {


		FileReader fw = new FileReader("C:\\Users\\shikh\\Desktop\\Shikhara-Course-Work\\CharFile.txt");
		int ch;
		while ((ch=fw.read())!= -1) {
			
            System.out.println("The" + ch + "=" + (char)ch);
        }
		fw.close();

	}

}
