package com.shikhara.oops;

public class Encapsulation1 {
	
	
	private String title;
	private String author;
	private double price; 
	

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


	public double getPrice() {
		return price;
	}



	public void  setPrice(double price) {
		if(price > 0) {
		this.price = price;
		}else {
			System.out.println("Price cannot be negative");
			 System.exit(0);
			
		}
	}
		
	public   void displayInfo() {
	
		System.out.println("The title of the book is:" + title+ "  And the author is:"+ author + "Price is:" + price);

		
		
	}

	public static void main(String[] args) {
		
		Encapsulation1 e1 = new Encapsulation1();
		
		e1.setAuthor("Shikhara");
		e1.setTitle("Java RT");
		e1.setPrice(12);
		e1.displayInfo();
		//System.out.println("The title of the book is:" + e1.getTitle()+ "  And the author is:"+ e1.getAuthor()+ "Price is:" + e1.getPrice());
		

	}

}
