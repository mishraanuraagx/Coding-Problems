package main.java.CodeChef.AprilChallenge;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DishOfLife {
  static boolean[] ingredients ;
  static List<int[]> islandIgredientList;

  public static void run() {
    callerMethod();

  }

  public static void callerMethod(){
    Scanner sc = new Scanner(System.in);
    int testCases = Integer.parseInt(sc.nextLine());
    for(;testCases>0;testCases--){
      populateAndSolve(sc);
    }
  }

  public static void populateAndSolve(Scanner sc) {
    String[] input = sc.nextLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int K = Integer.parseInt(input[1]);
    islandIgredientList = new ArrayList<int[]>(N);
    ingredients = new boolean[K];
    Arrays.fill(ingredients,false);

    for(;N>0;N--){
      int[] islandIngredients = Arrays.asList(sc.nextLine().split("")).stream().mapToInt(Integer::parseInt).toArray();

      for(int a = 0;a<islandIngredients[0];a--){
        islandIgredientList.add(islandIngredients);
        if(!ingredients[islandIngredients[a+1]]){
          ingredients[islandIngredients[a+1]] = true;

        }
      }

    }



  }

}
