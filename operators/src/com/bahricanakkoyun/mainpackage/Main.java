package com.bahricanakkoyun.mainpackage;

public class Main {
  public static void main(String[] args) {
    int x = 5;
    boolean d = true, e = false;

    System.out.println(x++); // 5 (6)
    System.out.println(++x); // 7
    System.out.println(x--); // 7 (6)
    System.out.println(--x); // 5
    System.out.println(x++ + ++x); // 5 + 7 = 12
    System.out.println(' ');

    x = 9;
    System.out.println("x = " + x + " (" + toBinaryString32(x) + ")"); // 00000000000000000000000000001001
    System.out.println("~x = " + ~x + " (" + toBinaryString32(~x) + ")"); // 11111111111111111111111111110110
    System.out.println(' ');

    System.out.println(!d); // false (opposite of boolean value)
    System.out.println(!e); // true
    System.out.println(' ');

    System.out.println("x = " + x + " (" + toBinaryString32(x) + ")"); // 00000000000000000000000000001001
    System.out.println("x << 2 = " + (x << 2) + " (" + toBinaryString32(x << 2) + ")"); // 00000000000000000000000000100100
    System.out.println(' ');

    // for positive number, >> and >>> works same
    System.out.println("x >> 2 = " + (x >> 2) + " (" + toBinaryString32(x >> 2) + ")"); // 00000000000000000000000000000010
    System.out.println("x >>> 2 = " + (x >>> 2) + " (" + toBinaryString32(x >>> 2) + ")"); // 00000000000000000000000000000010
    System.out.println(' ');

    // for negative number, >>> changes parity bit (MSB / most significant bit / leftmost) to 0
    System.out.println("~x = " + ~x + " (" + toBinaryString32(~x) + ")"); // 11111111111111111111111111110110
    System.out.println("~x >> 2 = " + (~x >> 2) + " (" + toBinaryString32(~x >> 2) + ")"); // 11111111111111111111111111111101
    System.out.println("~x >>> 2 = " + (~x >>> 2) + " (" + toBinaryString32(~x >>> 2) + ")"); // 00111111111111111111111111111101
    System.out.println(' ');

    int a = 6, b = 5, c = 20;
    System.out.println(a < b && a++ < c); // false && true = false
    System.out.println(a); // 6 because second condition is not checked
    System.out.println(a < b & a++ < c); // false & true = false
    System.out.println(a); // 7 because second condition is checked
    System.out.println(' ');

    System.out.println("a = " + a + " (" + toBinaryString32(a) + ")");
    System.out.println("c = " + c + " (" + toBinaryString32(c) + ")");
    System.out.println("a & c = " + (a & c) + " (" + toBinaryString32(a & c) + ")");
    System.out.println("a | c = " + (a | c) + " (" + toBinaryString32(a | c) + ")");
    System.out.println(' ');

    System.out.println((a < b) ? a : b); // 5 because condition (6 < 5) is false
  }

  public static String toBinaryString32(int i) {
    return String.format("%32s", Integer.toBinaryString(i)).replace(' ', '0');
  }
}
