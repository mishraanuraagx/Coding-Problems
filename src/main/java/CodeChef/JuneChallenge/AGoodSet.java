package main.java.CodeChef.JuneChallenge;


import java.util.Scanner;

public class AGoodSet {
  //1 2 4 7 10 13  16 19... after 7 just add 3 multiply
  //2 3 4 8 9 14 15 20 21 26 27
  public static int[] partialValues = {1,2,4,7};
  public static void run(){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- != 0){
      int d = sc.nextInt();
      //printing req no. of stored values
      for(int i=0;i<d && i < 4;i++){
        System.out.print(partialValues[i]+" ");
      }
      if(d>4){
        for(int i=1;i<=d-4;i++){
          System.out.print(partialValues[/*partialValues.length-1*/3]+i*3 + " ");
        }
      }
      System.out.println();
    }
  }
}
