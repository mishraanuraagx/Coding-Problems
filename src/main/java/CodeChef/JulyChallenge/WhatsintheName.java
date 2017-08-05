package main.java.CodeChef.JulyChallenge;


import java.util.Scanner;

public class WhatsintheName {
  public static void run() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- != 0) {
      StringBuilder finalString = new StringBuilder();
//      String finalLine = "";
      String line = sc.nextLine().toLowerCase();
      String[] lineArray = line.split(" ");
      int n = lineArray.length;
      if(line == ""){
        t++;
        continue;
      }
      if (n >= 1) {
        finalString.append(lineArray[n - 1].substring(0, 1).toUpperCase() + lineArray[n - 1].substring(1));
//        finalLine = lineArray[n - 1].substring(0, 1).toUpperCase() + lineArray[n - 1].substring(1);

      }

      if (n >= 2) {
        finalString.insert(0,lineArray[n - 2].substring(0, 1).toUpperCase() + ". ");
//        finalLine = lineArray[n - 2].substring(0, 1).toUpperCase() + ". " + finalLine;
      }

      if (n == 3) {
        finalString.insert(0,lineArray[n - 3].substring(0, 1).toUpperCase() + ". ");
//        finalLine = lineArray[n - 3].substring(0, 1).toUpperCase() + ". " + finalLine;
      }
      System.out.println(finalString.toString());
//      System.out.println(finalLine);
    }
  }
}
