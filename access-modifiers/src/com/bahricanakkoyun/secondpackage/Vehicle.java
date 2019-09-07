package com.bahricanakkoyun.secondpackage;

public class Vehicle {
  private int condition; // private data => can be accessed only inside its class
  boolean isPurchasable; // default data => can be accessed inside its class and same package classes
  /* protected data => can be accessed inside its class, same package classes,
     even different package classes (but this one is only possible by inheritance) */
  protected float price;

  public Vehicle () {
    condition = 2;
    isPurchasable = true;
    price = 200;
  }

  // public method => can be accessed from everywhere
  @Override
  public String toString() {
    return "condition (private) = " + condition + ", isPurchasable (default) = " + isPurchasable + ", price (protected) = " + price;
  }
}
