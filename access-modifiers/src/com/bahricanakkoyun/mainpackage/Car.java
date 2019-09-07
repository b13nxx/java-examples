package com.bahricanakkoyun.mainpackage;

import com.bahricanakkoyun.secondpackage.Vehicle;

class Car extends Vehicle {
  Car() {
    // this.condition = 3; // compile error, cannot access private data at different class
    // this.isPurchasable = false; // compile error, cannot access default data at different package
    this.price = 500;
  }
}
