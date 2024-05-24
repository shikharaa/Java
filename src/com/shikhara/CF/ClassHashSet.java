package com.shikhara.CF;

import java.util.HashSet;

class Java{
	private int year;
	private String con;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	@Override
	public String toString() {
		return "Java [year=" + year + ", con=" + con + "]";
	}
	
	public Java(int year, String con) {
		super();
		this.year = year;
		this.con = con;
	}
	
	
	
}
public class ClassHashSet {

	public static void main(String[] args) {
		Java j1 = new Java(2014, "EH");
		Java j2 = new Java(2015, "CF");
		Java j3 = new Java(2016, "IO");
		
		HashSet<Java> hs = new HashSet<Java>();
		
		hs.add(j3);
		hs.add(j2);
		hs.add(j1);
		
		for(Java k:hs) {
			
			System.out.println(k);
		}
		
	}

}
