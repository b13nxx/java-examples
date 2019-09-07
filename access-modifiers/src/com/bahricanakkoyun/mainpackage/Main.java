package com.bahricanakkoyun.mainpackage;

import com.bahricanakkoyun.secondpackage.*;

public class Main {
  public static void main(String[] args) {
    Vehicle ve = new Vehicle();
    Bicycle bi = new Bicycle();
    Car ca = new Car();

    // ca.price = 750; // compile error, remember protected data can be accessible inside different package only by 'inheritance'

    System.out.println("vehicle => " + ve.toString()); // vehicle => condition (private) = 2, isPurchasable (default) = true, price (protected) = 200.0
    System.out.println("bicycle => " + bi.toString()); // bicycle => condition (private) = 2, isPurchasable (default) = false, price (protected) = 70.0
    System.out.println("car => " + ca.toString()); // car => condition (private) = 2, isPurchasable (default) = true, price (protected) = 500.0
  }
}
