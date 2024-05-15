package com.shikhara.oops;

public class TestString1 {

	public static void main(String[] args) {
		
		String []a1 = {"Shikhara", "Akavaram","Reddy"};
		int i = 0;
		System.out.println("Printing using While Loop");
		while(i < a1.length) {
			System.out.println(a1[i]);
			i++;
		}
		System.out.println("\n");
		System.out.println("Printing using For Loop");
		
		for(int k =0; k < a1.length; k++) {
			System.out.println(a1[k]);
			
		}
		
		System.out.println("\n");
		System.out.println("Printing using For- each Loop");
		
		for(String l:a1) {
			System.out.println(l);
		}
	}

}
