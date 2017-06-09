package main.java.CodeChef.JuneChallenge;


import java.util.Scanner;

public class XennyAndCoinRankings {
  public static void run(){
    // Info: rank increment on X - axis with y=0; is 2.3,4.... = S(x+1)-1 relative to (0,0)
    // so rank on x-axis is (S(x+1)-1)+1 = S(x+1) where S(n) denotes Sum of first n numbers

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- != 0){
      long x = sc.nextInt();
      long y = sc.nextInt();
//      System.out.println(sum(x+1)+sum(y+x)-sum(x));
      System.out.println(sum((y+x))+x+1);
    }
  }
  public static long sum(long n){
    return n*(n+1)/2;
  }
}
