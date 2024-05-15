package com.shikhara.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationStudentData {

	public static void main(String[] args) {
		
		StudentData st1 = new StudentData(1,"Shikhara",100,23);
		StudentData st2 = new StudentData(2,"Abhi",90,45);
		StudentData st3 = new StudentData(3,"Reddy",80,18);
		StudentData[] st = {st1,st2,st3}; 
		
		try {
			FileOutputStream f1 = new FileOutputStream("StudentData.bin");
			ObjectOutputStream obj1 = new ObjectOutputStream(f1);
			obj1.writeInt(st.length); 
            for (StudentData student : st) {
                obj1.writeObject(student); 
            }
			obj1.close();
			System.out.println("Writing complete");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Now reading the data from binary file");
		
		try {
			FileInputStream f2 = new FileInputStream("StudentData.bin");
			ObjectInputStream obj2 = new ObjectInputStream(f2);
			int length = obj2.readInt();
			
			  StudentData[] readData = new StudentData[length];
			  
			  for(int i =0; i< length;
			  i++) {
			  
			  readData[i] = (StudentData)obj2.readObject(); 
			  System.out.println("The id: " + readData[i].getId());
			  System.out.println("The name: " + readData[i].getName());
			  System.out.println("The marks: " + readData[i].getMarks());
			  
			  }	
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		

	}

}
