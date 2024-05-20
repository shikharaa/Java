package com.shikhara.ObjectClass;

public class TestgetClass {

	public static void main(String[] args) {

			Object obj = new String("Shikhara");
			Class c= obj.getClass();
			System.out.println(c.getName());

	}

}


//output is 
//java.lang.String
