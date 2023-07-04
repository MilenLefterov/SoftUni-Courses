package Exercises.Exercise1;

import java.util.Scanner;

public class P09_Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int orders = Integer.parseInt(scan.nextLine());

        double total = 0;

        for (int i = 0; i < orders; i++) {
            double pricePerCapsule = Double.parseDouble(scan.nextLine());
            int daysInMonth = Integer.parseInt(scan.nextLine());
            int capsulesCount = Integer.parseInt(scan.nextLine());
            //((daysInMonth * capsulesCount) * pricePerCapsule)
            double currentTotal = (daysInMonth * capsulesCount) * pricePerCapsule;

            System.out.printf("The price for the coffee is: $%.2f\n", currentTotal);
            total += currentTotal;
        }
        System.out.printf("Total: $%.2f", total);

    }
}
