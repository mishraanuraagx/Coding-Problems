package main.java.CodeChef.JulyChallenge;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Harry and Hermione are playing a game in which Hermione challenges Harry by giving an array A and
 * a number S, and asks to provide an efficient magical algorithm to find a number K from array A
 * such that if all elements in A greater than K are changed to K, the sum of all elements in the
 * resulting array will be S.
 *
 * Now harry has to find that magical number K. So help out harry in this task. Input
 *
 * The first line contains an integer T, total number of testcases. Then follow T lines. First line
 * of each test case consists of two numbers represting N and S. Second line of each test case
 * consists of n integers represting array A. Output
 *
 * If there exists the number K print in a new line, else print "-1" (without inverted comma). If
 * more than one K is possible, then print the minimum one.
 */
public class HarryAndMagicalNumber {
  public static void run() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- != 0) {
      int N = sc.nextInt();
      int S = sc.nextInt();
      Set<Integer> A = new TreeSet();
      for (int i = 0; i < N; i++) {
        A.add(sc.nextInt());
      }

      Integer[] A1 = A.toArray(new Integer[A.size()]);

      int value = -1;
      for (int i = 0; i < A1.length; i++) {
        if (A1[(int) i] * (A1.length - i) == S) {
          value = A1[(int) i];
          break;
        }
      }
      System.out.println(value);

    }
  }

}
