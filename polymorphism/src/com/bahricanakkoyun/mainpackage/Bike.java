package com.bahricanakkoyun.mainpackage;

// dynamic polymorphism (runtime polymorphism) (overriding)
class Bike extends Vehicle {
  @Override
  void run() {
    System.out.println("Bike is running");
  }
}
