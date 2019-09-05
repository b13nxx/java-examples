package com.bahricanakkoyun.mainpackage;

public class Main {
  public static void main(String[] args) {
    // static polymorphism
    System.out.println(Adder.add(5, 15)); // 20
    System.out.println(Adder.add(5, 15, 10)); // 30
    System.out.println(Adder.add(5.7, 3.6)); // 9.3
    System.out.println(Adder.add(5.7, 3.6, 7.1)); // 16.4
    System.out.println(' ');

    // dynamic polymorphism
    Vehicle vehicle = new Vehicle(); // Vehicle is running
    Bike bike = new Bike(); // Bike is running

    vehicle.run();
    bike.run();
  }
}
