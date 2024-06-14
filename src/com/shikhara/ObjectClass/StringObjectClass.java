package com.shikhara.ObjectClass;

public class StringObjectClass {

	public static void main(String[] args) {
		
		String str1 = "Shikhara";
		String str2 = "  Reddy";

		String s = new String("Abhi");
		String s2 = s.intern();
		System.out.println(s2);
		
		
		int a =10;
		String a1 = String.valueOf(a);
		
		System.out.println("The int value converted to string is: " + a+10);
		
		
		
		System.out.println("To Upper Case: " + str1.toUpperCase());
		System.out.println("To Lower Case: " + str1.toLowerCase());
		
		System.out.println("trim() to elimate spaces: " + str2.trim());
		System.out.println("To check start (True) with:" + str1.startsWith("Sh"));
		System.out.println("To check start (False) with:" + str1.startsWith("k"));
		
		System.out.println("To check end (True) with:" + str1.endsWith("a"));
		System.out.println("To check end (False) with:" + str1.endsWith("h"));
		
		System.out.println("To check charAt :" + str1.charAt(2));
		System.out.println("To check charAt :" + str2.charAt(1));
		
		String name = "Shikhara is a bad programmer. bad system designer";
		
		System.out.println("Replace string-all places: " + name.replace("bad", "good"));
		
		
		StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");

        
        boolean areEqual = sb1.equals(sb2); 
        
        boolean areContentEqual = sb1.toString().equals(sb2.toString());

       
        System.out.println("Using default equals method: " + areEqual);
        System.out.println("Using content comparison: " + areContentEqual);
		
	}

}
