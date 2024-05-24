package com.shikhara.CF;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		
		t.add(5);
		t.add(90);
		t.add(8);
		t.add(2);
		t.add(2);
		System.out.println(t);
		
		Iterator k = t.descendingIterator();
		
		while(k.hasNext()) {
			
			System.out.println(k.next());
		}
		
		System.out.println(t.pollFirst()); //Lowest value
		System.out.println(t.pollLast()); //highest value
		
		
		
		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("A");
		t1.add("K");
		t1.add("L");
		t1.add("Arr");
		t1.add("Bcc");
		
		System.out.println();
		System.out.println(t1);
		
		System.out.println(t1.headSet("L"));
		System.out.println(t1.headSet("Arr", true));
		System.out.println(t1.subSet("Arr", "Bcc"));
		System.out.println(t1.tailSet("K"));

	}

}
