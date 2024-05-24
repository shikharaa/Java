package com.shikhara.CF;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		lh.add("A");
		lh.add("B");
		lh.add("C");
		lh.add("C");
		lh.add(null);
		
		Iterator t = lh.iterator();
		while(t.hasNext()) {
			
			System.out.println(t.next());
			
		}
		System.out.println(lh.remove("A"));
		System.out.println(lh.remove("K"));
		

	}

}
