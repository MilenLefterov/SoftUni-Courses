package PB_Exams.PB2And3May2019;

import java.util.Scanner;

public class P06VetParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int day = Integer.parseInt(scan.nextLine());
        int hour = Integer.parseInt(scan.nextLine());
        double sum = 0;

        for (int i = 1; i <= day; i++) {
            double currentSum = 0;
            for (int j = 1; j <= hour; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    currentSum += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    currentSum += 1.25;
                } else {
                    currentSum += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva\n", i, currentSum);
            sum += currentSum;
        }

        System.out.printf("Total: %.2f leva", sum);
    }
}
