package com.bahricanakkoyun.mainpackage;

public class Main {
  public static void main(String[] args) {
    /* abstraction lets you focus on what the object does instead of how it does it
       there are two ways of achieving abstraction in java: abstract class, interface */
    Bank b1 = new SBI();
    Bank b2 = new PNB();
    // Bank b3 = new Bank(); // abstract class cannot be instantiated

    System.out.println(b1.getRateOfInterest() + "%"); // 5%
    System.out.println(b2.getRateOfInterest() + "%"); // 2%
  }
}
