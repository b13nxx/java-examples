package com.bahricanakkoyun.mainpackage;

public class Main {
  public static void main(String[] args) {
    Programmer tom = new Programmer();

    System.out.println("Tom's salary is $" + tom.salary); // Tom's salary is $4000.0
    System.out.println("Tom's bonus is $" + tom.bonus); // Tom's bonus is $1000.0
    System.out.println("Tom's address is " + tom.address.toString()); // Tom's address is San Francisco, California, US
  }
}
