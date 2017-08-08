package main.java.CodeChef.JulyChallenge;

/**
 * Chef found a strange string yesterday - a string of signs s, where each sign is either a '<', '=' or a '>'. Let N be the length of this string. Chef wants to insert N + 1 positive integers into this sequence and make it valid. A valid sequence is a sequence where every sign is preceded and followed by an integer, and the signs are correct. That is, if a sign '<' is preceded by the integer a and followed by an integer b, then a should be less than b. Likewise for the other two signs as well.

 Chef can take some positive integers in the range [1, P] and use a number in the range as many times as he wants.

 Help Chef find the minimum possible P with which he can create a valid sequence.
 */

//TODO max: not submitted yet
import java.util.Scanner;

public class ChefandSignSequences {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // to skip new line
        while (t-- != 0) {
            String line = sc.nextLine();

            int countGreaterThan = 0;
            int maxGreaterThan = 0;
            int countLessThan = 0;
            int maxLessThan = 0;

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '<') {
                    countLessThan++;
                    if (countGreaterThan > maxGreaterThan) {
                        maxGreaterThan = countGreaterThan;
                    }
                    countGreaterThan = 0;
                } else if (line.charAt(i) == '>') {
                    countGreaterThan++;
                    if (countLessThan > maxLessThan) {
                        maxLessThan = countLessThan;
                    }
                    countLessThan = 0;
                }
            }

            if (countGreaterThan > maxGreaterThan) {
                maxGreaterThan = countGreaterThan;
            }
            if (countLessThan > maxLessThan) {
                maxLessThan = countLessThan;
            }

            System.out.println(Math.max(maxGreaterThan, maxLessThan)+1);
        }
    }
}
