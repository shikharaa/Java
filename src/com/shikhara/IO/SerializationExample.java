package com.shikhara.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	String name;
	int age;
	String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	  public Student(String name, int age, String address) { 
		  super(); 
		  this.name =name;  
		  this.age = age;
		  this.address = address; 
		  }
	 
	
}


public class SerializationExample {

	public static void main(String[] args) {
		
		Student st = new Student("Shikhara", 27, "Arizona");
		/*
		 * System.out.println(st.getName()); System.out.println(st.getAge());
		 * System.out.println(st.getAddress());
		 */
		
		try {
			FileOutputStream student = new FileOutputStream("student.bin");
			ObjectOutputStream obj1 = new ObjectOutputStream(student);
			obj1.writeObject(st);
			obj1.close();
			System.out.println("Writing to file complete");
			
		} catch (FileNotFoundException e) {


			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			System.out.println("Reading data from file");
			FileInputStream student = new FileInputStream("student.bin");
			ObjectInputStream obj2 = new ObjectInputStream(student);
			Student st1 = (Student)obj2.readObject();
			System.out.println("Student name: "+ st1.getName());
			System.out.println("Student age: "+ st1.getAge());
			System.out.println("Student address: "+ st1.getAddress());
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		


	}

}
