package com.bahricanakkoyun.mainpackage;

public class Main {
  public static void main(String[] args) {
    int b = 5, c = 10;

    // if else statement
    if (b > c) {
      System.out.println("condition is true");
    } else {
      System.out.println("condition is false");
    }
    // output is "condition is false" because condition (5 > 10) is false :)

    // switch case statement
    switch (c) {
      case 6:
        System.out.println("English");
        break; // not necessary but proper way is putting "break" for every case except last one (which is "default" most of the time)

      case 4:
        System.out.println("French");
        break;

      case 8:
        System.out.println("Korean");
        break;

      case 5:
        System.out.println("Spanish");
        break;

      default:
        System.out.println("Turkish");
    }
    System.out.println(' ');
    // output is "Turkish" because none of the cases will be matched

    // while statement, first check loop's condition then do loop's body
    int i = 0;
    while (i != 0) {
      System.out.println("Inside the while loop, counting: " + i);
    }

    // do-while statement, first do loop's body then check loop's condition
    do {
      System.out.println("Inside the do-while loop, counting: " + i);
    } while (i != 0);
    System.out.println(' ');

    // for loop, number of iteration is fixed
    for (i = 0; i < 10; i++) {
      System.out.println("for loop, counting: " + i);
    }
    System.out.println(' ');

    /* we can use break statement in all types of loops such as for loop, while loop and do-while loop
       same loop as above, but this time loop will be break at 5 */
    for (i = 0; i <= 10; i++) {
      if (i == 5) {
        //breaking the loop
        break;
      }
      System.out.println("for loop, counting: " + i);
    }
    System.out.println(' ');

    // continue statement, loop for only listing odd numbers
    for (i = 0; i <= 10; i++) {
      if (i % 2 == 0)
        continue;

      System.out.println("for loop, counting: " + i);
    }
    System.out.println(' ');

    // for-each statement (enhanced for)
    String[] planets = {
      "Mercury", "Venus", "Earth",
      "Mars", "Jupiter", "Saturn", "Uranus", "Pluto"
    };

    for (String planet : planets) {
      System.out.println(planet);
    }
  }
}
