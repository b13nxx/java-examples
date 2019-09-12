package com.bahricanakkoyun.mainpackage;

public class Main {
  public static void main(String[] args) {
    String stringNumber = "45";

    // convert String to int using Integer.parseInt() method
    int intNumber = Integer.parseInt(stringNumber);

    // convert String to Integer using Integer.valueOf() method
    Integer intNumber2 = Integer.valueOf(stringNumber);

    System.out.println("stringNumber to intNumber = " + intNumber); // 45

    // this concept is also same for float and double
    float floatNumber = Float.parseFloat(stringNumber);
    Float floatNumber2 = Float.valueOf(stringNumber);

    System.out.println("stringNumber to floatNumber = " + floatNumber); // 45.0

    double doubleNumber = Double.parseDouble(stringNumber);
    Double doubleNumber2 = Double.valueOf(stringNumber);

    System.out.println("stringNumber to doubleNumber = " + doubleNumber); // 45.0
    System.out.println(' ');

    intNumber = 34;
    floatNumber = 45.4f;
    doubleNumber = 14.78;

    // convert int to String using String.valueOf() method
    stringNumber = String.valueOf(intNumber);

    // or you can also use Integer.toString() method
    stringNumber = Integer.toString(intNumber);

    System.out.println("intNumber to stringNumber = " + stringNumber); // 34

    stringNumber = String.valueOf(floatNumber);
    stringNumber = Float.toString(floatNumber);

    System.out.println("floatNumber to stringNumber = " + stringNumber); // 45.4

    stringNumber = String.valueOf(doubleNumber);
    stringNumber = Double.toString(doubleNumber);

    System.out.println("doubleNumber to stringNumber = " + stringNumber); // 14.78
  }
}
