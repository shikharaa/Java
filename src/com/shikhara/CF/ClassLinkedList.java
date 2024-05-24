package com.shikhara.CF;

import java.io.*;
import java.util.LinkedList;

class Employee implements Serializable{
	
	private String name;
	private String dept;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}
	
	public Employee(String name, String dept, int age) {
		super();
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	
	
}

public class ClassLinkedList {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e1 = new Employee("abc", "Maths", 45);
		Employee e2 = new Employee("Abhi", "Science", 35);
		Employee e3 = new Employee("Raj", "CS", 36);
		
		LinkedList<Employee> le = new LinkedList<Employee>();
		le.add(e1);
		le.add(e2);
		le.add(e3);
		
		
		for(Employee e: le) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("IO");
		FileOutputStream fs = new FileOutputStream("linkedlist.bin");
		ObjectOutputStream ob = new ObjectOutputStream(fs);
		ob.writeObject(le);
		System.out.println("Serializaton complete");
		
		FileInputStream fs1 = new FileInputStream("linkedlist.bin");
		ObjectInputStream ob1 = new ObjectInputStream(fs1);
		LinkedList li = (LinkedList)ob1.readObject();
		
		for(Object ek : li) {
			
			Employee ek1 = (Employee)ek;
			System.out.println("Using for each: " + ek1);
			
		}
		System.out.println(li);
		System.out.println("De Serialization complete");
		

	}

}
