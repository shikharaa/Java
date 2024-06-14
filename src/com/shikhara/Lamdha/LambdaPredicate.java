package com.shikhara.Lamdha;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaPredicate {

	public static void main(String[] args) {


		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Shikhara");
		arr.add("Reddy");
		arr.add("Abhi");
		
		Predicate<String> startwithP = (a)->a.startsWith("S");
		
		List<String> result = arr.stream()
                .filter(startwithP)
                .collect(Collectors.toList());
		
		System.out.println(result);
		
		

	}

}
