package com.shikhara.EH;

public class ExceptionNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
		
		try {
			int par = Integer.parseInt(str);
			System.out.println(par);

		}catch(Exception  e ) {
			
			System.out.println("Error in try method");
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
