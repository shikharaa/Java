package com.shikhara.EH;

public class ExceptionFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int re = 10/0;
			
			System.out.println(re);
			
		}catch ( ArithmeticException e ) {
			
			e.printStackTrace();
		}finally {
			
			System.out.println("In finally block");
		}
		
		
		System.out.println("End Code");
		
		

	}

}
