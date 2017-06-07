package main.java.CodeChef.Beginner;


import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorial2 {
  public static void run(){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- != 0){
      int n = sc.nextInt();
      if(n == 0 || n == 1){
        System.out.println("1");
      }else {
        BigInteger f = new BigInteger("1");
        for(int i=2;i<=n;i++){
          f = f.multiply(BigInteger.valueOf(i));
        }

        System.out.println(f);
      }
      }

  }
}
