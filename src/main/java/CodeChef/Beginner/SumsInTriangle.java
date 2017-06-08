package main.java.CodeChef.Beginner;


import java.util.Scanner;

public class SumsInTriangle {
  public static int[][] array;
  public static int[][] valueStorage;
  public static int rows;

  public static void run() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- != 0) {
      rows = sc.nextInt();
      array=new int[rows][];
      valueStorage=new int[rows][];
      for (int i = 0; i < rows; i++) {
        array[i]=new int[i+1];
        valueStorage[i]=new int[i+1];
        for(int j =0;j<=i;j++){
          array[i][j]=sc.nextInt();
        }
      }
      int value = findMaxSumInTriangle(0,0);
      System.out.println(value);
    }
//    for(int i=0;i<rows;i++){
//      for(int j=0;j<=i;j++){
//        System.out.print(valueStorage[i][j]+" ");
//      }
//      System.out.println();
//    }
  }

  public static int findMaxSumInTriangle(int row,int col){
    if(rows == row+1){
      return array[row][col];
    }
    if(valueStorage[row][col]  == 0){
      valueStorage[row][col] = Math.max(findMaxSumInTriangle(row+1,col),findMaxSumInTriangle(row+1,col+1))+array[row][col];
    }
    return valueStorage[row][col];
  }
}
