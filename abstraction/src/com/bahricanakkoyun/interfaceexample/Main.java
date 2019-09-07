package com.bahricanakkoyun.interfaceexample;

public class Main {
  public static void main(String[] args) {
    Bank b1 = new SBI();
    Bank b2 = new PNB();
    // Bank b3 = new Bank(); // it cannot be instantiated just like the abstract class

    System.out.println(b1.rateOfInterest() + "%"); // 5.17%
    System.out.println(b2.rateOfInterest() + "%"); // 2.6%
  }
}
