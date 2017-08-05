package main.java.CodeChef.JulyChallenge;

/**The Riddler has a simple question for you. You have to tell him the count of numbers between A and B (A<=B)which are divisible by M.

 For every test case , print the answer in a new line.
 Input

 The first line contains an integer T, total number of testcases. Then follow T lines, each line contains A, B and M respectively as described above.
 Output

 For every test case print the answer in a new line.*/

import java.util.BitSet;
import java.util.Scanner;

public class TheRiddler {
  public static void run(){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- != 0) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int M = sc.nextInt();

      if (B < M) {
        System.out.println("0");
        continue;
      }
      if (A < M)
        A = M;
//      bitsetMethod(A,B,M);
      int count = divisionMethod(A,B,M);
      System.out.println(count);

    }
  }

  public static int divisionMethod(int A,int B,int M){

    /**
     * http://www.geeksforgeeks.org/count-numbers-divisible-m-given-range/*/

    if(A%M==0){
      return (B/M)-(A/M)+1;
    }
    return (B/M)-(A/M);
  }

  private static int firstIntDivisible(int a, int b,int m) {
    int i=-1;
    for(int j=a;j<b;j++){
      if(j%m==0){
        i=j;
        break;
      }
    }
    return i;
  }
  private static void bitsetMethod(int A,int B,int M) {
    BitSet rangeBetweenAandB = new BitSet(B - A + 1);
    /**
     * if lets say no. i is divisible by m which comes after a, i-a is the distance between the no.s
     * then bitset which need to be set one is i-a+1*/
    int i = firstIntDivisible(A, B, M);
    int count = 0;
    if (i == -1) {
      System.out.println("0");
      return;
    } else {
      for (int j = i - A; j <= B - A; j = j + M) {
        rangeBetweenAandB.set(j);
        count++;
      }
      System.out.println(count);
    }
  }
}
