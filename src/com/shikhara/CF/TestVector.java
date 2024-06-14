package com.shikhara.CF;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>(4);
		Vector obj = new Vector();
		System.out.println(v.capacity());
		v.add("A");
		v.add("N");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("C");
		v.add("C");
		v.add("C");
		v.add("C");
		
		System.out.println(v.capacity());
		System.out.println(v);
		System.out.println(v.size());
		
		v.addElement("K");
		System.out.println(v);
		System.out.println(v.size());
		
		System.out.println(v.firstElement());
		
		
		
		System.out.println("remove" + v.remove(4));
		
		System.out.println(v);
		
		
		
		

	}

}
