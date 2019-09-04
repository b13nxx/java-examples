package com.bahricanakkoyun.mainpackage;

class A {
  int instanceVariable = 20;
  static int staticVariable = 50;

  void writeInfo() {
    int localVariable = 5;

    System.out.println("instanceVariable = " + this.instanceVariable);
    System.out.println("staticVariable = " + staticVariable);
    System.out.println("localVariable = " + localVariable);
  }
}
