package com.shikhara.EH;

public class ExceptionThrow {
	
	
	static void checkAge(int age) {
		
		if( age <18) {
			
			throw new ArithmeticException("Not eligible to vote age is less than 18");
			
			
		}else {
			
			System.out.println("You are eligible to vote");
		}
	}

	
	
	
	public static void main(String[] args) {
		
		
		/*
		 * try { checkAge(17); } catch (AgelimtException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		
		checkAge(17);

	}

}
