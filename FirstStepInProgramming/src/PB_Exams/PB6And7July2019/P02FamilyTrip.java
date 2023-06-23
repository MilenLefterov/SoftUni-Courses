package PB_Exams.PB6And7July2019;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int numberOfNights = Integer.parseInt(scan.nextLine());
        double pricePerNight = Double.parseDouble(scan.nextLine());
        double percentageForAdditionalCosts = Double.parseDouble(scan.nextLine());

        if (numberOfNights > 7)
            pricePerNight *= 0.95;

        double sum = (numberOfNights * pricePerNight) +
                ((percentageForAdditionalCosts / 100) * budget);

        if (sum <= budget)
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", Math.abs(sum - budget));
        else
            System.out.printf("%.2f leva needed.", Math.abs(sum - budget));

    }
}
