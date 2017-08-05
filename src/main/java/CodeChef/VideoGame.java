package main.java.CodeChef;

import java.util.Scanner;

public class VideoGame {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        /**
         * leftmost position is 0
         * and rightmost is N-1*/
        int presenPosition = 0;
        boolean holdingBox = false;

        int[] allStacks = new int[N];
        for (int i = 0; i < N; i++) {
            allStacks[i] = sc.nextInt();
        }
        int input = sc.nextInt();
        while (input != 0) {
            /**
             * moving left*/
            if (input == 1) {
                if (presenPosition > 0){
                    presenPosition--;
                }

            }
            /**
             * moving right*/
            if (input == 2) {
                if (presenPosition < N-1){
                    presenPosition++;
                }

            }
            /**
             * picking box*/
            if (input == 3) {
                if (!holdingBox && allStacks[presenPosition]>0){
                    holdingBox = true;
                    allStacks[presenPosition]--;
                }

            }
            /**
             * dropping box*/
            if (input == 4) {
                if (holdingBox && allStacks[presenPosition]<H){
                    holdingBox = false;
                    allStacks[presenPosition]++;
                }

            }

            input = sc.nextInt();
        }


        for(int i=0;i<N;i++){
            System.out.print(allStacks[i] + " ");
        }

        /**/

    }
}
