package com.shikhara.abstractandinterface;

interface Shape{
	
	 void getArea();
	
}

class Rectangle implements Shape{
	
	public void getArea() {
		
		System.out.println("The Shape is Rectangle");
		
		
	}
	
}


class Circle implements Shape{
	
	public void getArea() {
		
		System.out.println("The Shape is Circle");
		
		
	}
	
}


class Triangle implements Shape{
	
	public void getArea() {
		
		System.out.println("The Shape is Triangle");
		
		
	}
	
}

public class Interface1 {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.getArea();
		
		Triangle t1 = new Triangle();
		t1.getArea();
		
		Circle c1 = new Circle();
		c1.getArea();

	}

}
