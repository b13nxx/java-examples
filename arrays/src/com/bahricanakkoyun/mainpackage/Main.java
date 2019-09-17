package com.bahricanakkoyun.mainpackage;

public class Main {
  public static void main(String[] args) {
    int[] arr = {5, 4, 12, 9, 30}; // declaration, instantiation and initialization

    for (int i : arr) System.out.println(i);

    System.out.println();
    System.out.println(min(new int[]{54, 71, 46, 89, 47})); // anonymous array

    // multidimensional arrays
    int[][] multidimarr = new int[3][3]; // 3 rows and 3 columns
    multidimarr[0][0] = 1;
    multidimarr[0][1] = 2;
    multidimarr[0][2] = 3;
    multidimarr[1][0] = 4;
    multidimarr[1][1] = 5;
    multidimarr[1][2] = 6;
    multidimarr[2][0] = 7;
    multidimarr[2][1] = 8;
    multidimarr[2][2] = 9;

    // or
    int[][] multidimarr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    System.out.println();

    for (int i = 0; i < multidimarr2.length; i++) {
      for (int j = 0; j < multidimarr2[i].length; j++) {
        System.out.print(multidimarr2[i][j] + " ");
      }
      System.out.println();
    }

    // jagged arrays (different columns)
    int[][] arr2 = new int[3][];
    arr2[0] = new int[3];
    arr2[1] = new int[4];
    arr2[2] = new int[2];
  }

  static int min(int[] nums) {
    int minNum = nums[0];
    for (int i = 1; i < nums.length; i++) if (nums[i] < minNum) minNum = nums[i];
    return minNum;
  }
}
