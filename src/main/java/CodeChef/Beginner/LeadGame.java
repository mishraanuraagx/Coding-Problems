package main.java.CodeChef.Beginner;


import java.util.Scanner;

public class LeadGame {
  public  static void run(){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int diff = 0;
    int p1=0,p2 =0;
    while(t-- != 0){
      p1 =p1+ sc.nextInt();
      p2 =p2+ sc.nextInt();
      if(Math.abs(p1-p2)>Math.abs(diff)){
        diff = p1-p2;
      }
    }
    if (diff > 0) {
      System.out.println("1 " + diff);
    } else {
      System.out.println("2 " + Math.abs(diff));
    }
  }
}
