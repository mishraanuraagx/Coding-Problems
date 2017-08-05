package main.java.CodeChef.JuneChallenge;


import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ChefAndTheFeast {
  public static void run(){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- !=0){
      int n = sc.nextInt();
      long totalValue=0;
      long size=0;
      long sum=0;
      int arraySize=0;
      Long[] happinessArray = new Long[n];
      Set tSet = new TreeSet<Long>();
      for(int i=0;i<n;i++){
        long value = sc.nextLong();
        if(value>=0){
          size++;
          sum=sum+value;
        } else {
          happinessArray[arraySize]=value;
          tSet.add(value);
          arraySize++;
        }
      }
      Iterator<Long> it = tSet.iterator();
      while(it.hasNext()) {
        System.out.println(it.next());
      }
      System.out.println();
    }
  }

//  public static void run2(){
//    Scanner sc = new Scanner(System.in);
//    int t = sc.nextInt();
//    while(t-- !=0){
//      int n = sc.nextInt();
//      long totalValue=0;
//      long totalPostiveValuesSize=0;
//      long totalPositiveValuesSum=0;
//      long[] happinessArray = new long[n];
//      for(int i=0;i<n;i++){
//        happinessArray[i]=sc.nextLong();
//        if(happinessArray[i]>=0){
//          totalPositiveValuesSum=totalPositiveValuesSum+happinessArray[i];
//          totalPostiveValuesSize++;
//        }else {
//          totalValue=totalValue+happinessArray[i];
//        }
//      }
//      totalValue=totalValue+totalPositiveValuesSum*totalPostiveValuesSize;
//      System.out.println(totalValue);
//    }
//  }
}
