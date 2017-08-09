package main.java.CodeChef.Beginner;

/**The Chef had a box with N numbers arranged inside it: A1, A2, ..., AN. He also had the number N at the front, so that he knows how many numbers are in it. That is, the box actually contains N+1 numbers. But in his excitement due the ongoing IOI, he started dancing with the box in his pocket, and the N+1 numbers got jumbled up. So now, he no longer knows which of the N+1 numbers is N, and which the actual numbers are.



 He wants to find the largest of the N numbers. Help him find this.
 */
import java.util.Scanner;

public class FindtheMaximumValue {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[;\r\n]+");
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- != 0) {
            int max=-1,secondMax=-1,count=0;
            Scanner intReader = new Scanner(sc.nextLine());
            while (intReader.hasNextInt()) {
                int num = intReader.nextInt();
                if(num >= max){
                    secondMax = max;
                    max = num;
                } else if (num >= secondMax){
                    secondMax = num;
                }
                count++;
            }
            if(count-1 == max){
                System.out.println(secondMax);
            } else{
                System.out.println(max);
            }
        }
    }
}