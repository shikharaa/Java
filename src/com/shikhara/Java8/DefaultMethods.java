package com.shikhara.Java8;

interface Test{
	
	public int square(int a);
	
	default void show(){
		System.out.println("This is Default Method");
	}
	
}


class Callable implements Test{
	
	public int square(int a) {
		
		return  a * a;
	}
}



public class DefaultMethods {

	public static void main(String[] args) {
		
		Callable c1 = new Callable();
		int k1 = c1.square(2);
		System.out.println(k1);
		c1.show();

	}

}
