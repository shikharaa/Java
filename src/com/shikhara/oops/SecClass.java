package com.shikhara.oops;

public class SecClass {
	
	
	public void fullhrottle() {
		System.out.println("Car is going at it's max speed");
	}
	
	public void speed(int speed) {
		
		System.out.println("the max speed is" + speed);
	}

	public static void main(String[] args) {
		
		SecClass myCar = new SecClass();
		
		myCar.fullhrottle();
		myCar.speed(80);

	}


}
