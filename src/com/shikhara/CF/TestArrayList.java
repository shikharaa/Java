//Creating Arraylist, methods, iterating the list in different ways

package com.shikhara.CF;

import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		/*
		 * ArrayList l = new ArrayList();
		 * 
		 * l.add("Shikku"); l.add(11); l.add('f');
		 * 
		 * System.out.println(l);
		 */
		list.add("Shikhara");
		list.add("Akavaram");
		list.add("readdy");
		//list.add(null);
		list.add("Abhi");
		
		Iterator r = list.iterator();
		
		while(r.hasNext()){
			
			System.out.println(r.next());
			
		}
		
		
		
		for(String f :list) {
			System.out.println(f);
		}
		
		System.out.println("get value:" + list.get(1));
		System.out.println("The set value: " + list.set(2,"Akka"));
		
		System.out.println("The list is:" + list);
		
		
		Collections.sort(list);
		
		for(String kl: list) {
			
			System.out.println("The list after sorting : " + kl);
		}
		
		
		ListIterator<String> li = list.listIterator(list.size());
		
		while(li.hasPrevious()) {
			
			String n = li.previous();
			System.out.println(n);
		}
		
		for(int i=0; i<list.size();i++) {
			System.out.println("The list using for loop : " + list.get(i));
		}
		
		Iterator<String> r1 = list.iterator();
		
		r1.forEachRemaining(a->{
			
			System.out.println("Uisng for remanining : " +a);
			
			});
		
		
		
		
		
		

	}

}
