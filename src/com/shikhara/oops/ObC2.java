package com.shikhara.oops;



public class ObC2 {
	
	String name;
	String model;
	int year; 
	
	public ObC2(String name, String model, int year) {
		
		//System.out.println("The car name is:" +name + " and model :" + model + "year is :" + year );
		this.name = name;
		this.model = model;
		this.year = year;
		
		
		
	}
	
	public void displayInfo() {
		
		System.out.println("The car name is:" +name + " and model :" + model + "year is :" + year );
	}
	
	
	
public static void main(String[] args) {
		
	ObC2 ob1 = new ObC2("Jeep", "cheroke", 2021);
	ob1.displayInfo();
		
	}
	
}