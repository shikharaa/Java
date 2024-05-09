package com.shikhara.EH;

public class ExecptionNull {

	public static void main(String[] args) {
		
		
		//NullpointerException
		
		String s= null;
		
		try {
			
			int l = s.length();
			System.out.println(l);
			
		}catch( Exception e ){
			
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
			
		}

	}

}
