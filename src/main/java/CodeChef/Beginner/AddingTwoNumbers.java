package main.java.CodeChef.Beginner;


import java.util.Scanner;

public class AddingTwoNumbers {
  public static void run(){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- != 0){
      long a = sc.nextLong();
      long b = sc.nextLong();
      System.out.println(a+b);
    }
  }
}
