package com.shikhara.oops;

class Testmod{
	
	public int year1 = 2026;
	
	private int price1 = 123;
	
	protected String  model1 = "Old";
	
	
	public void method1() {
		System.out.println("Inside public method");
		System.out.println("The year is: " + year1);
		System.out.println("The price is: " + price1); 
		System.out.println("The model is: " + model1);

		
	}
	
	private void method2() {
		System.out.println("Inside private method");
		System.out.println("The year is: " + year1);
		System.out.println("The price is: " + price1); 
		System.out.println("The model is: " + model1);

		
	}
	
	
	protected void method3() {
		System.out.println("Inside protected method");
		System.out.println("The year is: " + year1);
		System.out.println("The price is: " + price1); 
		System.out.println("The model is: " + model1);

		
	}
		
}


public class Accessmod {
	

	public static void main(String[] args) {
		
		Accessmod ac1= new Accessmod();
		Testmod t1 = new Testmod();
		t1.method1();
		//t1.method2();// this will get error
		t1.method3();
		
		//System.out.println("The year is: " + t1.year1);
		//System.out.println("The price is: " + t1.price1); // we can't get the price1 here
		//System.out.println("The model is: " + t1.model1);

	}

}
