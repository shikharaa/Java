package com.shikhara.EH;

public class ExecptionArray {

	public static void main(String[] args) {
		
		
		int[] array1 = {1,2,3};
		
		try {
			
			array1[6] = 4;
			
		}catch( Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
			
		}

	}

}
