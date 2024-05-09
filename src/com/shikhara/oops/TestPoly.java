package com.shikhara.oops;

class Shape{
	
	public void Draw() {
		
		System.out.println("Drawing a shape");
	}
	
}

class Circle extends Shape{
	
	
	public void Draw() {
		
		System.out.println("Drawing a Circle");
	}
}

class Square extends Shape{
	
	
	public void Draw() {
		
		System.out.println("Drawing a Square");
	}
}

public class TestPoly {

	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		
		Shape c1 = new Circle();
		Shape c2 = new Square();
		s1.Draw();
		c1.Draw();
		c2.Draw();

	}

}
