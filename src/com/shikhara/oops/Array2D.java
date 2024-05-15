package com.shikhara.oops;

public class Array2D {

	public static void main(String[] args) {


		int a[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		
		for ( int r = 0; r<= 3; r++) {
			
			for ( int c=0; c <=2; c++) {
				
				System.out.println(" " + a[r][c]);
			}
			
			System.out.println();
		}

	}

}
