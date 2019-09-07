package com.bahricanakkoyun.mainpackage;

/* if you are extending an abstract class that has an abstract method,
   you must either provide the implementation of the method or make this class abstract */
class SBI extends Bank {
  @Override
  int getRateOfInterest() {
    return 5;
  }
}
