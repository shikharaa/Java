//program for abstract class

package com.shikhara.oops;



abstract class Print{
	
	 void display() {
		 System.out.println("In abstract class");
	 }
	
	
}


public class TestData extends Print{

	public static void main(String[] args) {
		
		TestData t1 = new TestData();
		
		t1.display();
	}

}
