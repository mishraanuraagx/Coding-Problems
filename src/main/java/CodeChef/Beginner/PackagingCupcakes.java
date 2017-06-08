package main.java.CodeChef.Beginner;


import java.util.Scanner;

public class PackagingCupcakes {
  public static void run(){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- != 0){
      int cupcakes = sc.nextInt();
      int size = 1,leftover=0;
      if (cupcakes == 1 || cupcakes == 2) {
        System.out.println((cupcakes == 1)?"1":"2");
      }else{
       int half = cupcakes/2;
       leftover=cupcakes%half;
       size=half;
       if(cupcakes%(half+1)>leftover){
         leftover=cupcakes%(half+1);
         size=half+1;
       } else if (cupcakes % (half - 1) > leftover) {
         leftover=cupcakes%(half-1);
         size=half-1;
       }
        System.out.println(size);
      }
    }
  }
}
