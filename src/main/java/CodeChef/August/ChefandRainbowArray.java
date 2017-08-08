package main.java.CodeChef.August;

import java.util.Scanner;

public class ChefandRainbowArray {

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        boolean[] all7NumbersFound = new boolean[7];
        while (t-- != 0) {
            boolean isTrue = true;
            int n = sc.nextInt();
            sc.nextLine();
            int[] intArray = new int[n];
            for (int i = 0; i < n; i++) {
                intArray[i] = sc.nextInt();
            }

            for (int i = 0; i < n / 2; i++) {
                if ((i == 0 && intArray[i] != 1 ) || intArray[i]>7) {
                    System.out.println("no");
                    isTrue = false;
                    break;
                }

                if (!(intArray[i] == intArray[n - i - 1])) {
                    System.out.println("no");
                    isTrue = false;
                    break;
                }
                if (!(i < n / 2 && intArray[i + 1] - intArray[i] <= 1)) {
                    System.out.println("no");
                    isTrue = false;
                    break;
                    /**
                     * checks for both when n is odd or even*/
                }
                if (intArray[i] < 8) {
                    all7NumbersFound[intArray[i]-1] = true;

                    /**
                     * this doesnt check for middle element and also doesnt check whether its above 7 or not*/

                }
            }
            if(n<13 && isTrue){
                isTrue = false;
                System.out.println("no");
                break;
            }
            if(isTrue && n % 2 == 1 && intArray[n/2] ==7){
                all7NumbersFound[6] = true;
            }

            if (isTrue) {
                for (int i = 0; i < 7; i++) {
                    if (all7NumbersFound[i] != true) {
                        isTrue = false;
                        System.out.println("no");
                        break;
                    }
                }
            }
            if (isTrue) {
                System.out.println("yes");
            }


        }
    }
}


