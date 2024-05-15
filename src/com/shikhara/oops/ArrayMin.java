package com.shikhara.oops;


public class ArrayMin {
	
	
	public static void findMin( int []arr) {
		int s = arr[0];
		
		for(int i= arr.length-1; i>=0;i--) {
			//System.out.println(arr[i]);
			if (arr[i] < s) {
                s = arr[i];
                //System.out.println(s);
            }
			
			
		}
		
		System.out.println("The smallest is :" + s);
		
	}
	
	public static void findMax( int []arr) {
		int s = arr[0];
		
		for(int i= arr.length-1; i>=0;i--) {
			//System.out.println(arr[i]);
			if (arr[i] > s) {
                s = arr[i];
                //System.out.println(s);
            }
			
			
		}
		
		System.out.println("The Largest is :" + s);
		
	}

	public static void main(String[] args) {
		//int []abc = {1,2,3,4};
		int []abc = {23,3,56,7};
		
		findMin(abc);
		findMax(abc);
		
		

	}

}
