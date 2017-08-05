package main.java.CodeChef.JulyChallenge;


import java.util.Scanner;

public class ChefandSignSequences {
  public static void run() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine(); // to skip new line
    while (t-- != 0) {
      String line = sc.nextLine();
      long min = 1;
      long max = 1;
      long value = 1;

      if (!line.contains(">") && !line.contains("<") && !line.contains("=")) {
        System.out.println("0");
        continue;
      }

      char[] c = line.toCharArray();
      int n = c.length;

      for (int i = 0; i < n; i++) {
        if (c[i] == '<') {
          value++;
          if (i < n - 1) {
            if (c[i + 1] == '>') {
              if (value < max) {
                value = max;
              }
            }
          }
        } else if (c[i] == '>') {
          value--;
          if (i < n - 1) {
            if (c[i + 1] == '<') {
              if (value > min) {
                value = min;
              }

            }
          }
        }

        if (value > max) {
          max = value;
        }
        if (value < min) {
          min = value;
        }

      }
      int longestLessThanSeq = 0;
      int longestGreaterThanSeq = 0;
      int seq = 0;
      boolean isGreatherThan = c[0] == '>' ? true : false;
      for (int i = 0; i < n;) {
        while (isGreatherThan && i < n) {
          seq++;
          if (i < n - 1) {
            if (c[i + 1] != '>') {
              if (longestGreaterThanSeq < seq) {
                longestGreaterThanSeq = seq;
                seq = 0;
                isGreatherThan = false;
              }
            }
          }
          i++;
        }
        while (!isGreatherThan && i < n) {
          seq++;
          if (i < n - 1) {
            if (c[i + 1] == '>') {
              if (longestLessThanSeq < seq) {
                longestLessThanSeq = seq;
                seq = 0;
                isGreatherThan = true;
              }
            }
          }
          i++;
        }
      }
      int s = Math.max(Math.max(longestGreaterThanSeq, longestLessThanSeq),seq) + 1;
      System.out.println(max - min + 1);
      System.out.println(s);

    }
  }
}
