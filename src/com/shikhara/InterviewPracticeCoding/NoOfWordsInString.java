package com.shikhara.InterviewPracticeCoding;

import java.util.HashMap;
import java.util.Map;

public class NoOfWordsInString {

	public static void main(String[] args) {

		String str = "Hello, This is Shikhara";
		
		Map<String, Integer> wordCount = new HashMap<>(); 
		
		 String[] words = str.split("\\W+");
		
		 for (String word : words) { 
			 wordCount.put(word, wordCount.getOrDefault(word, 0) + 1); 
		 } 
		 
		 System.out.println(wordCount);
		 

	}

}
