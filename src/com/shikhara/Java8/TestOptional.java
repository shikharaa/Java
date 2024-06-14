package com.shikhara.Java8;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = ""; 
		
		Optional<String> op = Optional.of(str);
		
		if(op.isPresent()) {
			System.out.println("Value is present");
		}else {
			System.out.println("Value is not present");
		}
		 //answer is:value is present
		
		String str1 = null;
		
		Optional<String> op1 = Optional.ofNullable(str1);
		
		if(op1.isPresent()) {
			System.out.println(op1.get());
		}else {
			String value = op1.orElse("Default value");
			System.out.println("Value is not present so: " + value);
		}
		

	}

}
