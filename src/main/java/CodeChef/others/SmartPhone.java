package main.java.CodeChef.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by MAX on 31-07-2017.
 */
public class SmartPhone {

  public static void run(){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    List budgetArray = new ArrayList<Integer>();
    while (t-- != 0) {
      budgetArray.add(sc.nextInt());
      sc.nextLine();
    }

    //TODO max: use treeSet
    Collections.sort(budgetArray);


    long prize, maxProfit, index;
    index = 0;
    prize = (int) budgetArray.get((int)index);
    maxProfit = prize * (budgetArray.size() - index);
    for (int i = 1; i < budgetArray.size(); i++) {
      prize = (int)budgetArray.get(i);
      long possibleProfit = prize*(budgetArray.size()-i);
      if(possibleProfit>maxProfit){
        maxProfit = possibleProfit;
        index = i;
      }
    }
    System.out.println(maxProfit);

  }
}
