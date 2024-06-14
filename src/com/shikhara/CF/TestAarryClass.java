package com.shikhara.CF;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestAarryClass {

	public static void main(String[] args) {


		
		ArrayList<String> arr = new ArrayList<String>(); 
		
		arr.add("Kapil");
		arr.add("shirisha");
		arr.add(null);
		arr.add("priya");
		arr.add("suresh");
		
		for(String i: arr) {
			System.out.println(i);
		}
		
		
		java.util.Iterator<String> it=arr.iterator();
		
		  while(it.hasNext())
		  {
			  System.out.println(
it.next
());
	  }

//		  Enumeration<String> e=list.elements();
//		
//		  while(e.hasMoreElements())
//		  {
//			  System.out.println(e.nextElement());
//		  }
//		
	}
		

	

}
