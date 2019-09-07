package com.bahricanakkoyun.secondpackage;

public class Bicycle extends Vehicle {
  public Bicycle () {
    // this.condition = 1; // compile error, cannot access private data at different class
    this.isPurchasable = false;
    this.price = 70;
  }
}
