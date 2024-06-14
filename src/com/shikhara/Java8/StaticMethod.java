package com.shikhara.Java8;

interface Test1{
	
	public int square(int a);
	
	static void show(){
		System.out.println("This is Default Method");
	}
	
}


class Callable1 implements Test1{
	
	public int square(int a) {
		
		return  a * a;
	}
}



public class StaticMethod {

	public static void main(String[] args) {
		
		Callable1 c2 = new Callable1();
		int k1 = c2.square(2);
		System.out.println(k1);
		//Test1.show(); //static methods are not requried to create objcts we can call directly

	}

}