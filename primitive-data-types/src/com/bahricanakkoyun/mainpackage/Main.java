package com.bahricanakkoyun.mainpackage;

public class Main {
  public static void main(String[] args) {
    boolean one = false; // boolean is 1-bit information (true or false)
    byte a = 8; // byte is between -128 to 127
    short b = 15000; // short is between -32,768 to 32,767
    int c = -975000; // int is between -2,147,483,648 (-2^31) to 2,147,483,647 (2^31 - 1)
    long d = -200450L; // long is between -9,223,372,036,854,775,808 (-2^63) to 9,223,372,036,854,775,807 (2^63 - 1)

    /* float's value range is unlimited but it is recommended to use a float (instead of double)
       if you need to save memory in large arrays of floating point numbers */
    float f = 25.45f;

    double d1 = 88.9; // double's value range is also unlimited

    /* char is 16-bit Unicode character.
       its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive) */
    char letter = 'A';
  }
}
