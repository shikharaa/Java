package com.shikhara.InterviewPracticeCoding;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		char ch;
		
		int len = str.length();
		//System.out.println(len);
		
		for(int i = len-1 ; i >= 0; --i) {
			
			System.out.println(str.charAt(i));

		}

	}

}
