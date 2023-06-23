package Week4.Lecture4_Exercises;

import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (max < num)
                max = num;

            if (min > num)
                min = num;
        }
        System.out.printf("Max number: %d\n",max);
        System.out.printf("Min number: %d",min);
    }
}
