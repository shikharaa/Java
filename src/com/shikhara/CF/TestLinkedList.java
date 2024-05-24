package com.shikhara.CF;

import java.util.*;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> in = new LinkedList<String>();
		in.add("Hello");
		in.add("good");
		in.add("Morning");
		
		System.out.println(in);
		
		in.addFirst("hy");
		in.addLast("cofee");	
		
		System.out.println("After adding elements"+in);
		
		in.add(2, "Evening");
		
		System.out.println("After index adding  elements"+in);
		
		in.remove("hy");
		
		System.out.println("After remove elements"+in);
		
		LinkedList<Integer> in1 = new LinkedList<Integer>();
		in1.add(10);
		in1.add(45);
		
		LinkedList<String> in3 = new LinkedList<String>();
		in3.add("office");
		in.addAll(in3);
		
		System.out.println("After adding one more linked list : " + in);
		
		Iterator r = in.descendingIterator();
		
		while(r.hasNext()) {
			System.out.println(r.next());
			
		}
		
		System.out.println("Normal iterator");
		
		Iterator r1 = in.iterator();
		
		while(r1.hasNext()) {
			System.out.println(r1.next());
			
		}
		
		System.out.println("Using for each");
		
		for(String k: in) {
			System.out.println(k);
		}

	}

}
