package com.shikhara.oops;


class AnimalNew {
	
 private String name;
 private int age;


 public AnimalNew(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
}
class DogNew extends AnimalNew {
 private String breed;

 
 public DogNew(String name, int age, String breed) {
     super(name, age); 
     this.breed = breed;
 }
 
 
 public void makeSound() {
     System.out.println("Dog barks");
 }

 
 public String getBreed() {
     return breed;
 }
}


public class OopsProgram {
 public static void main(String[] args) {
	 
	 DogNew myDog = new DogNew("Buddy", 5, "Golden Retriever");
	 
     System.out.println("Name: " + myDog.getName());
     System.out.println("Age: " + myDog.getAge());
     System.out.println("Breed: " + myDog.getBreed());
     myDog.makeSound();
 }
}



