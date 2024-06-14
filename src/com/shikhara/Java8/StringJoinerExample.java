package com.shikhara.Java8;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {

		StringJoiner joiner = new StringJoiner(", ");
		
		joiner.add("Shikhara");
		joiner.add("Alice");
		joiner.add("Reddy");
		System.out.println(joiner);
		
		StringJoiner j = new StringJoiner("  , ", "[", "]    "); //delimiter, sufix and prefix
		
		j.add("Shikhara");
		j.add("Alice");
		j.add("Reddy");
		System.out.println(j);
		
		
		//Shikhara, Alice, Reddy
		//[Shikhara  , Alice  , Reddy] 
		
		
		StringJoiner j1 = new StringJoiner(",");
		j1.setEmptyValue("No elements");
		System.out.println(j1);
		
		joiner.merge(j);
		
		System.out.println(joiner);
		
		
	}

}
