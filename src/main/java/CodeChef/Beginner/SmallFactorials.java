package main.java.CodeChef.Beginner;


import java.util.Scanner;

public class SmallFactorials {
  public static void run() {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());

    for(int i =0;i<t;i++){
      int f = Integer.parseInt(sc.nextLine());
      System.out.println(factorial(f));
    }
  }

  public static int factorial(int x){
    int fact = 1;
    if(x == 0) return 1;
    else{
      while(x > 1){
        fact = fact * x;
        x--;
      }
    }
    return fact;
  }
}
