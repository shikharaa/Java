package com.shikhara.CF;

import java.util.Enumeration;
import java.util.Vector;

public class TestEmu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v1 = new Vector<String>();
		v1.add("ABC");
		v1.add("abc");
		v1.add("shikh");
		v1.add("reddy");
		
		Enumeration<String> e1 = v1.elements();
		
		while(e1.hasMoreElements()) {
			
			System.out.println(e1.nextElement());
		}
		

	}

}
