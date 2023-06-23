package Week4.MoreExercises;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int oldSum = 0;
        int lastSum = 0;
        int diff = 0;
        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= n; i++) {
            num1 = Integer.parseInt(scan.nextLine());
            num2 = Integer.parseInt(scan.nextLine());


            if (i > 1) {
                lastSum = num1 + num2;
                if (lastSum != oldSum)
                    diff = Math.abs(oldSum - lastSum);
                else
                    diff = lastSum;
            }

            oldSum = num1 + num2;
        }

        if (diff == lastSum)
            System.out.printf("Yes, value=%d\n", oldSum);
        else
            System.out.printf("No, maxdiff=%d\n", diff);

    }
}
