package PB_Exams.PB6And7April2019;

import java.util.Scanner;

public class P02GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int numberOfStatistics = Integer.parseInt(scan.nextLine());
        double costPerSuit = Double.parseDouble(scan.nextLine());
        double sum = budget * 0.1;

        if (numberOfStatistics > 150)
            sum += (numberOfStatistics * costPerSuit) * 0.9;
        else
            sum += numberOfStatistics * costPerSuit;

        if (sum <= budget)
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", Math.abs(sum - budget));
        else
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", Math.abs(sum - budget));

    }
}
