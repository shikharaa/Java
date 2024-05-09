package com.shikhara.EH;


class AgelimtException extends Exception{
	
	
	AgelimtException(String msg){
		
		super(msg);	
		
	}
	
}

public class UserExce {
	
	
	static void checkAge(int age) throws AgelimtException {
		
		if( age <18) {
			
			throw new AgelimtException("Not eligible to vote age is less than 18");
			
			
		}else {
			
			System.out.println("You are eligible to vote");
		}
	}

	
	
	
	public static void main(String[] args) throws AgelimtException {
		
		
		/*
		 * try { checkAge(17); } catch (AgelimtException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		
		checkAge(17);

	}

}
