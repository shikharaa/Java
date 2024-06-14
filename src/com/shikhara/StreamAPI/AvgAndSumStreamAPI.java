package com.shikhara.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvgAndSumStreamAPI {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1,2,3,3,4);
		
		int sum = l1.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println("The Sum is:" +sum);
		
		double avg = l1.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println("The average is:" + avg);
		

	}

}
