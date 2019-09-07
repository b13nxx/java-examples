package com.bahricanakkoyun.mainpackage;

public class Main {
  public static void main(String[] args) {
    Student tom = new Student();

    tom.setCollege("KITE");
    // tom.college = "AKG"; // compile error

    System.out.println(tom.getCollege());
  }
}
