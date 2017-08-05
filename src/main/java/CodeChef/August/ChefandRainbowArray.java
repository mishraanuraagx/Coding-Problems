package main.java.CodeChef.August;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChefandRainbowArray {

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- != 0) {
            boolean isTrue = true;
            int n = sc.nextInt();
            sc.nextLine();
            Map intOccourenceCount = new HashMap<Integer, Integer>();
            int previousNo = 0;
            int currentNo = 0;
            int index = 0;
            for (int i = 0; i < n; i++) {
                currentNo = sc.nextInt();
                if (currentNo < 0 || currentNo - previousNo > 2) {
                    System.out.println("no");
                    isTrue = false;
                    break;
                } else if (currentNo - previousNo == 0 || currentNo - previousNo == 1) {
                    intOccourenceCount.put(currentNo, intOccourenceCount.containsKey(i) ? (int) intOccourenceCount.get(i) + 1 : 1);
                } else if (currentNo - previousNo == -1) {
                    index = i;
                    break;
                }
                previousNo = currentNo;
            }
            int count = 0;
            if (isTrue) {

                for (int i = index; i < n; ) {
                    previousNo = currentNo;
                    count = 0;
                    while (previousNo == currentNo && i<n) {
                        count++;
                        currentNo = sc.nextInt();
                        i++;
                    }
                    if (count != (int) intOccourenceCount.get(previousNo)) {
                        System.out.println("no");
                        isTrue = false;

                    }
                }
            }

            if (isTrue) {
                System.out.println("Yes");
            }
        }
    }
}
/*welcome to microsoft
 wtmeoil cc r;*/

