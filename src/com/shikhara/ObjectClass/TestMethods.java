package com.shikhara.ObjectClass;

import java.util.Objects;

class Book implements Cloneable {
	
	private String title;
	private String author;
	private int year;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, title, year);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title) && year == other.year;
	}
	
	
	public Book(String title, String author, int year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("The object is deleted");
		super.finalize();
	}
	
	
	
	
	
}


public class TestMethods {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book b1 = new Book("Java Method", "Shikhara", 2024);
		
		//Book b2 = new Book("Method", "Abhi", 2023);
		
		Book b2 = (Book)b1.clone();
		
		Class c1 = b1.getClass();
		
		System.out.println("The Class name is: " + c1.getName());
		System.out.println( "The Book b1 author: "+ b1.getAuthor());
		System.out.println( "The Book b2 author: "+ b2.getAuthor());
		
		
		System.out.println( "The Book b1 author: "+ b1.getTitle());
		System.out.println( "The Book b2 author: "+ b2.getTitle());
		
		System.out.println( "The Book b1 author: "+ b1.getYear());
		System.out.println( "The Book b2 author: "+ b2.getYear());
		
		System.out.println("Book b1 hash:" + b1.hashCode());
		
		System.out.println("Book b2 hash:" + b2.hashCode());
		
		System.out.println("Checking book b1 == book b2 :" + b1.equals(b2) );
		
		b1 = null; // for testing finalize
		System.gc();
		
		

	}

	

}
