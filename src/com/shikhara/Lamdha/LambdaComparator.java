package com.shikhara.Lamdha;

import java.util.ArrayList;

public class LambdaComparator {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Shikhara");
		arr.add("Reddy");
		arr.add("Abhi");
		
		
		arr.sort((a,b)->(a.compareTo(b)));
		System.out.println("Sorted Strings" + arr);
		
		
		arr.sort((a,b)->(b.compareTo(a)));
		
		System.out.println("Sorted Strings in Reverse" + arr);
		
		/*
		 * arr.sort((a, b) -> { System.out.println(a); System.out.println(b); return
		 * b.compareTo(a); });
		 */

	}

}
