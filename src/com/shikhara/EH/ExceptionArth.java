package com.shikhara.EH;

public class ExceptionArth {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 0 ; 
		
		try {
			int c = a/b;
			System.out.println("The output is " +c);
		}catch( Exception  e){
			
			System.out.println("Error in try method");
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
			
		}

	}

}
