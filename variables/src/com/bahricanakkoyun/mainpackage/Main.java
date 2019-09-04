package com.bahricanakkoyun.mainpackage;

public class Main {
  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new A();

    System.out.println("Instance Specific Variables");
    System.out.println("a1.instanceVariable = " + a1.instanceVariable); // a1.instanceVariable = 20
    System.out.println("a2.instanceVariable = " + a2.instanceVariable); // a2.instanceVariable = 20
    System.out.println(' ');

    a1.instanceVariable = 60;
    System.out.println("after a1.instanceVariable = 60");
    System.out.println("a1.instanceVariable = " + a1.instanceVariable); // a1.instanceVariable = 60
    System.out.println("a2.instanceVariable = " + a2.instanceVariable); // a2.instanceVariable = 20
    System.out.println(' ');
    System.out.println(' ');

    /* it was written in this way just for the purpose of showing
       directly use class names to access static variables and methods like A.staticVariable */
    System.out.println("Not Instance Specific Variables");
    System.out.println("a1.staticVariable = " + a1.staticVariable); // a1.staticVariable = 50
    System.out.println("a2.staticVariable = " + a2.staticVariable); // a2.staticVariable = 50
    System.out.println(' ');

    a2.staticVariable = 45;
    System.out.println("after a2.staticVariable = 45");
    System.out.println("a1.staticVariable = " + a1.staticVariable); // a1.staticVariable = 45
    System.out.println("a2.staticVariable = " + a2.staticVariable); // a2.staticVariable = 45

    /* and we cannot access localVariable at all
       System.out.println(a1.localVariable); will be compiler ERROR */

    System.out.println(' ');
    System.out.println(' ');
    System.out.println("-- Inside A Class (A1) --");
    a1.writeInfo();
  }
}
