package com.shikhara.abstractandinterface;

interface Vehicle {
 void start();
 void stop();
 void accelerate(double speed);
 void brake();
}

class Car implements Vehicle {
 private String brand;
 private double speed;

 public Car(String brand) {
     this.brand = brand;
     this.speed = 0;
 }

 
 public void start() {
     System.out.println(brand + " car is starting.");
 }


 public void stop() {
     System.out.println(brand + " car is stopping.");
     speed = 0;
 }

 
 public void accelerate(double speed) {
     this.speed += speed;
     System.out.println(brand + " car is accelerating to " + this.speed + " km/h.");
 }

 public void brake() {
     System.out.println(brand + " car is braking.");
     speed -= 10; 
     if (speed < 0) {
         speed = 0;
     }
 }

 public void displaySpeed() {
     System.out.println("Current speed of " + brand + " car is " + speed + " km/h.");
 }
}

public class Interface3 {
 public static void main(String[] args) {
     Car myCar = new Car("Toyota");
     myCar.start();
     myCar.accelerate(50);
     myCar.displaySpeed();
     myCar.brake();
     myCar.displaySpeed();
     myCar.stop();
 }
}