package com.shikhara.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	private String name;
	private int id;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}


	
	
	
	
	
	
	
}
public class SeriAndDeser {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee e = new Employee("Shikhara", 1, 20000);
		//System.out.println(e);
		
		FileOutputStream fi = new FileOutputStream("employee.bin");
		ObjectOutputStream ob = new ObjectOutputStream(fi);
		ob.writeObject(e);
		System.out.println("Writing Complete");
		ob.close();
		
		FileInputStream fi1 = new FileInputStream("employee.bin");
		ObjectInputStream ob1 = new ObjectInputStream(fi1);
		Employee k1 = (Employee)ob1.readObject();
		System.out.println(k1);
		System.out.println("Reading complete");
		ob1.close();
		
		
		
		
		

	}

}
