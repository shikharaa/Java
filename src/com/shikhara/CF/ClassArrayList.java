//Program for creating the user defined class objects using Arraylist 
//Seri and De-ser

package com.shikhara.CF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import java.io.Serializable;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

class ArrayData implements Serializable {
	
	private String name;
	private int age;
	private int salary;

	

	@Override
	public String toString() {
		return "ArrayData [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}



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



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public ArrayData(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	} 
	
}





public class ClassArrayList {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ArrayData a1 = new ArrayData("Shikhara",27,90000);
		ArrayData a2 = new ArrayData("Raj",28,100000);
		ArrayData a3 = new ArrayData("Sabitha",50,80000);
		
		ArrayList<ArrayData> al = new ArrayList<ArrayData>();
		al.add(a1);	
		al.add(a2);	
		al.add(a3);	
		
		 java.util.Iterator<ArrayData> r = al.iterator();
		 
		 while(r.hasNext()) {
			 ArrayData d = (ArrayData)r.next();
			// System.out.println(d);
		 }
		 
		 //Seri
		 
		FileOutputStream fs = new FileOutputStream("Arraylist.bin");
		ObjectOutputStream ob = new ObjectOutputStream(fs);
		//for(ArrayData k: al) {
			ob.writeObject(al);
		//}
		
		System.out.println("Serialization complete");
		 	
		FileInputStream fs1 = new FileInputStream("ArrayList.bin");
		ObjectInputStream ob1 = new ObjectInputStream(fs1);
		/*
		 * for(ArrayData l: al) { ArrayData lis = (ArrayData)ob1.readObject();
		 * System.out.println(lis); }
		 */
		
		ArrayList  list=(ArrayList)ob1.readObject();  
		System.out.println(list);
		System.out.println("De-Serialization complete");
		
		

	}

}


//output

/*
 * ArrayData [name=Shikhara, age=27, salary=90000] ArrayData [name=Raj, age=28,
 * salary=100000] ArrayData [name=Sabitha, age=50, salary=80000]
 */
