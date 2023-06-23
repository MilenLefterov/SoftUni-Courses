package Week5.Exercises;

import java.util.Scanner;

public class P11HappyCatParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        double totalSum = 0;

        for (int i = 1; i <= days; i++) {
            double sum = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    sum += 2.5;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    sum += 1.25;
                } else {
                    sum += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva\n", i, sum);
            totalSum += sum;
        }
        System.out.printf("Total: %.2f leva", totalSum);
    }
}
