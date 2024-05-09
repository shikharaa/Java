//program for Super keyword 

package com.shikhara.oops;

class AnimalP {
	
	AnimalP(){System.out.println("Inside default const AnimalP");}
	
	String name = "puppy";

	  public void display(){
	    System.out.println("I am an animal");
	  }
	}
	class Dog extends AnimalP {
		
		Dog(){
			super();
			System.out.println("Inside default const Dog");
		}
		
		String name = "mommy";

	  @Override
	  public void display(){
	    System.out.println("I am a dog");
	  }

	  public void printMessage(){
		  
		  
		  super.display(); //parent class method is called.
		  
		  
		  display();//Here the method in Subclass is called, as it is overridden by parent
		  
		  System.out.println(name); //subclass
		  System.out.println(super.name); //superclass( parent class) 
	  }
	}

	public class TestSuper {
	  public static void main(String[] args) {
	    Dog dog1 = new Dog();
	    dog1.printMessage();
	  }
	}
