package com.bahricanakkoyun.mainpackage;

// static polymorphism (compile-time polymorphism) (overloading)
class Adder {
  static int add(int a, int b) {
    return a + b;
  }

  static int add(int a, int b, int c) {
    return a + b + c;
  }

  static double add(double a, double b) {
    return a + b;
  }

  static double add(double a, double b, double c) {
    return a + b + c;
  }
}
