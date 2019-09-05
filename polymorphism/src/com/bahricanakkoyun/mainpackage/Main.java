package com.bahricanakkoyun.mainpackage;

public class Main {
  public static void main(String[] args) {
    // static polymorphism
    System.out.println(Adder.add(5, 15));
    System.out.println(Adder.add(5, 15, 10));
    System.out.println(Adder.add(5.7, 3.6));
    System.out.println(Adder.add(5.7, 3.6, 7.1));
    System.out.println(' ');

    // dynamic polymorphism
    Vehicle vehicle = new Vehicle();
    Bike bike = new Bike();

    vehicle.run();
    bike.run();
  }
}
