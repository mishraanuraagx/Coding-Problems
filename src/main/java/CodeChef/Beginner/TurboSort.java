package main.java.CodeChef.Beginner;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TurboSort {
  public static void run() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int[] res = new int[t];
    for (int i = 0; i < t; i++) {
      res[i] = sc.nextInt();
    }
    Arrays.sort(res);
    for(int i : res){
      System.out.println(i);
    }

    sort2(res);
    sort3(res);
    sort4(res);
  }

  public static void sort2(int[] res){
//    Integer[] what = Arrays.stream( res ).boxed().toArray( Integer[]::new );
    List<Integer> s  = Arrays.stream( res ).boxed().collect( Collectors.toList() );
    s.sort(Comparator.comparing(Integer::intValue).reversed());
    for (Integer i : s){
      System.out.println(i);
    }
  }

  public static void sort3(int[] res){
    for(int i=0;i<res.length;i++){
      for(int j=i+1;j<res.length;j++){
        if(res[i]>res[j]){
          int temp = res[i];
          res[i]=res[j];
          res[j]=temp;
        }
      }
    }
    for(int i=0;i<res.length;i++){
      System.out.println(res[i]);
    }
  }

  public static void sort4(int[] res){
    List<Integer> s  = Arrays.stream( res ).boxed().collect( Collectors.toList() );
    Set<Integer> tSet = new TreeSet<Integer>(s);
    for(int i : tSet){
      System.out.println(i);
    }
  }
}
