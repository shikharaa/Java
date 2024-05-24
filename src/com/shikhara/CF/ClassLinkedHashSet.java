package com.shikhara.CF;

import java.util.LinkedHashSet;

class Book {
	
	private String name;
	private int  year;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", year=" + year + "]";
	}
	public Book(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	
	
}
public class ClassLinkedHashSet {

	public static void main(String[] args) {
		Book e1 = new Book("Basics", 12);
		Book e2 = new Book("Java", 14);
		
		LinkedHashSet<Book> b1 = new LinkedHashSet();
		
		b1.add(e2);
		b1.add(e1);
		
		for(Book k: b1) {
			
			System.out.println(k);
		}
		
		

	}

}
