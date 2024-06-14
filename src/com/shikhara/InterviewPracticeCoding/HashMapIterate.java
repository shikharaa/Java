package com.shikhara.InterviewPracticeCoding;

import java.util.*;

public class HashMapIterate {

	

	public static void main(String[] args) {

		HashMap<String, String> hsmap = new HashMap<String, String>();
		
		hsmap.put("1", "Shikhara");
		hsmap.put("2", "Reddy");
		
		Iterator<Map.Entry<String, String>> re = hsmap.entrySet().iterator();
		
		while(re.hasNext()) {
			Map.Entry<String, String> entry = re.next();
			System.out.println("key: "+ entry.getKey() + " Value: " + entry.getValue());
		}
		
		System.out.println("Using advance for loop");
		
		for(Map.Entry<String, String> e : hsmap.entrySet() ) {
			
			System.out.println("key: "+ e.getKey()+ " Value: " + e.getValue());
			
		}
	}

}
