package main.java.CodeChef.Beginner;


import static java.lang.Integer.MAX_VALUE;


import java.util.Arrays;
import java.util.Scanner;
// TODO max: Some NZEC error comes up, online search says its not handling some exception
public class SmallFactorials {
//  static int max = MAX_VALUE/10;
//  static int[] res = new int[max];
  public static void run() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for(int i =0;i<t;i++){
      int f = sc.nextInt();
      try{
        factorial(f);
      }catch(Exception e){
        return;
      }
    }
    }


  public static void factorial(int x){
    int[] res = new int[MAX_VALUE/10];
    int resSize = 1;
    if (x == 0 || x == 1) {
      System.out.println("1");
    }
    else{
      Arrays.fill(res,0);
      res[0]=1;
      for(int n=2;n<=x;n++){
       resSize = multiply(n,res,resSize);
     }
      for(int i=1;i<=resSize;i++){
        System.out.print(res[resSize-i]);
      }
      System.out.println();
    }
  }

  public static int multiply(int n, int[] res, int resSize){
    int carry = 0;
    for(int i=0;i<resSize;i++){
      int prod = res[i]*n + carry;
      res[i] = prod%10;
      carry = prod/10;
    }
    while(carry>0){
      res[resSize] = carry%10;
      carry = carry/10;
      resSize++;
    }
    return  resSize;
  }

}
