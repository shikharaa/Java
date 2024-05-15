package com.shikhara.IO;

import java.io.*;

public class StudentData implements Serializable {
	
	private int id;
	private String name;
	private int marks;
	private transient int age;
	public StudentData(int id, String name, int marks, int age) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}
	
	
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
	

}
