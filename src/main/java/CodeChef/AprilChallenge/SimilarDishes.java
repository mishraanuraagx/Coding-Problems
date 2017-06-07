package main.java.CodeChef.AprilChallenge;

//
//Chef has just found a recipe book, where every dish consists of exactly four ingredients. He is going to choose some two dishes and prepare them for dinner. Of course, he likes diversity and wants to know whether the two dishes are similar.
//
//    Two dishes are called similar if at least half of their ingredients are the same. In other words, at least two of four ingredients of the first dish should also be present in the second dish. The order of ingredients doesn't matter.
//
//    Your task is to examine T pairs of dishes. For each pair, check if the two dishes are similar and print "similar" or "dissimilar" accordingly.
//    Input
//
//    The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
//
//    The first line of each test case contains four distinct strings, denoting ingredients needed for the first dish. Each ingredient is represented by a string of length between 2 and 10 inclusive, consisting of lowercase English letters.
//
//    The second line of each test case describes the second dish in the same format.
//    Output
//
//    For each test case, output a single line containing the answer — "similar" if at least half of the ingredients are same, and "dissimilar" otherwise (without the quotes).
//    Constraints
//
//    1 ≤ T ≤ 200
//    The length of each string will be between 2 and 10 inclusive.
//
//    Example
//
//    Input:
//    5
//    eggs sugar flour salt
//    sugar eggs milk flour
//    aa ab ac ad
//    ac ad ae af
//    cookies sugar grass lemon
//    lemon meat chili wood
//    one two three four
//    one two three four
//    gibberish jibberish lalalalala popopopopo
//    jibberisz gibberisz popopopopu lalalalalu
//
//    Output:
//    similar
//    similar
//    dissimilar
//    similar
//    dissimilar



import java.util.Scanner;
import java.util.StringJoiner;

public class SimilarDishes {
  static int  id,i,j;
  static String[] firstDishRecipe;
  static String[] secondDishRecipe;
  static int matchesFound = 0;

  public static void run(){

    Scanner sc = new Scanner(System.in);;
    id = Integer.parseInt(sc.nextLine());

    for(;id>0;id--) {
      firstDishRecipe = new String(sc.nextLine()).split(" ");
      secondDishRecipe = new String(sc.nextLine()).split(" ");


      for(i=3;i>=0;i--){
        for(j=3;j>=0;j--){
          if(firstDishRecipe[i].equals(secondDishRecipe[j])){
            matchesFound++;
          }
        }
      }

      if(matchesFound >=2){
        System.out.println("similar");
      }else{
        System.out.println("dissimilar");
      }

      matchesFound=0;

    }



  }
}
