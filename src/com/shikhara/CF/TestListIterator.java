package com.shikhara.CF;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {
		
		
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("Kala");
		l1.add("Ajj");
		l1.add("KJJ");
		
		ListIterator<String> a1 = l1.listIterator();
		
		System.out.println("Forward Direction");
		//Forward direction
		while(a1.hasNext()) {
			String e = a1.next();
			System.out.println("uisng list interator: "+e);
			//a1.remove();
			
			if(e.equals("KJJ")) {
				a1.add("alllllll");
				a1.previous();
			}
			
			if(e.equals("Ajj")) {
				a1.set("updateAjj");
				a1.previous();
			}
			
			if(e.equals("Ajj")) {
				a1.previous();
				a1.remove();
			}
			
		}
		
		System.out.println();
		System.out.println("Backward Direction");
		
		while(a1.hasPrevious()) {
			
			System.out.println(a1.previous());
		}
		
		System.out.println();
		Iterator r1 = l1.iterator();
		
		while(r1.hasNext()) {
			
			System.out.println("Using Iterator: " + r1.next());
			System.out.println("Using Iterator: " + r1.hashCode());
			
		}
		
		
		
		

	}

}
