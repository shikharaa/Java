package com.shikhara.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamAPI {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(2,5,1,7,8);
		
		Stream<Integer> data = nums.stream();
		
		//Stream mappedData = data.map(n->n*2);
		
		//Stream sortedData = data.sorted();
		
		//mappedData.forEach(n->System.out.println(n));
		//sortedData.forEach(n->System.out.println(n));
		
		 nums.stream().
				sorted().
				forEach(n->System.out.println(n));
				
		List<Integer> result =  data.filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(result);
		
		int even = nums.stream().filter(n->n%2 ==0).reduce(0,(ans,i)->ans+i);
		
		System.out.println(even);
		
		
		
		


	}

}
