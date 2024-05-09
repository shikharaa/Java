package com.shikhara.oops;

class Animal {

	String dogname;

	public void bark() {

		System.out.println("Dog is braking");
	}
}


  class AnimalPrice extends Animal { int price;
  
  public void getDetails() {
  
  System.out.println("These are the details: " + price + " name: " + dogname);
  
  }
  
  }
 

public class TestInheritance {

	public static void main(String[] args) {
		
		 AnimalPrice a1 = new AnimalPrice();
		 
		 a1.price = 12000; 
		 a1.dogname = "puppey";
		 a1.bark(); a1.getDetails();
		
		

	}

}
