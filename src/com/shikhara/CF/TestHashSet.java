package com.shikhara.CF;

import java.util.*;

public class TestHashSet {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("D");
		
		System.out.println(hs.remove("A"));
		
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("E");
		hs.addAll(hs1);
		
		hs.removeAll(hs1);
		
		hs.removeIf(str->str.contains("B"));
		
		hs.clear();
		
		System.out.println(hs);
		
		Iterator r = hs.iterator();
		
		while(r.hasNext()) {
			System.out.println(r.next());
		}
		
		
		
		
		
	}

}
