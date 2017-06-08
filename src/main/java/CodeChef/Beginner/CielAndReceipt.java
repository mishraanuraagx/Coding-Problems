package main.java.CodeChef.Beginner;


import java.util.Scanner;

public class CielAndReceipt {
  public static int menuValues[];
  public static int closestArrayIndex;
  public static int minOrderSize;

  public static void run() {
    setMenuValues();
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- != 0) {
      int d = sc.nextInt();
      findClosestArrayIndex(d);
    }
  }

  private static void findClosestArrayIndex(int d) {
    for (int i = 0; i < menuValues.length; i++) {
      if (menuValues[i] < d) {
        closestArrayIndex = i;
      } else if (menuValues[i] == d) {
//        System.out.println(menuValues[++closestArrayIndex] + " "+ ++closestArrayIndex);
        System.out.println("1");
        return;
      }
    }
//    System.out.println(menuValues[closestArrayIndex] + " "+ closestArrayIndex);

    findMinOrderSize(d);
  }

  private static void findMinOrderSize(int d) {
    int value = menuValues[closestArrayIndex];
    int i = closestArrayIndex;
    minOrderSize = 1;
    if (closestArrayIndex == menuValues.length-1) {

      while (value + menuValues[closestArrayIndex] <= d) {
        minOrderSize++;
        value = value + menuValues[closestArrayIndex];
      }
    }
    if(value == d){
      System.out.println(minOrderSize);
    }

    while (value < d) {
      if ((value + menuValues[i - 1]) == d) {
        minOrderSize++;
        value = d;
        System.out.println(minOrderSize);
      } else if ((value + menuValues[i - 1]) < d) {
        minOrderSize++;
        value = value + menuValues[i - 1];

      }
      i--;
    }
  }

  public static void setMenuValues() {
    menuValues = new int[12];
    menuValues[0] = 1;
    for (int i = 1; i < 12; i++) {
      menuValues[i] = menuValues[i - 1] * 2;
    }
  }

}
