package com.shikhara.CF;

import java.util.HashSet;

public class HashCodeEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> a1 = new HashSet<String>();
		
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("E");
		a1.add("F");
		
		
HashSet<String> a2 = new HashSet<String>();
		
		a2.add("A");
		a2.add("B");
		a2.add("C");
		a2.add("E");
		a2.add("F");
		
		
HashSet<String> a3 = new HashSet<String>();
		
		a3.add("A");
		
		
		boolean result = a1.equals(a2);
		System.out.println("The list is: " + result);
		
		
		boolean result1 = a1.equals(a3);
		System.out.println("The list is: " + result1);
		
		System.out.println("The hash code for a1is: " + a1.hashCode());
		System.out.println("The hash code for a1is: " + a2.hashCode());
		System.out.println("The hash code for a1is: " + a3.hashCode());
		

	}

}
