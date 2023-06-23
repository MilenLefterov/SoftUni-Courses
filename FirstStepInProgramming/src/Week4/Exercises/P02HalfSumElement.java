package Week4.Exercises;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int current = 0;

        for (int i = 1; i <= n; i++) {
            current = Integer.parseInt(scan.nextLine());
            if (current > max)
                max = current;
            sum += current;
        }

        if (max == sum - max) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs((sum - max) - max));
        }

    }
}
