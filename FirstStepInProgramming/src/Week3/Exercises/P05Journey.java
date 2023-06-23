package Week3.Exercises;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination = "";
        String accommodationType = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                budget = budget * 0.30;
                accommodationType = "Camp";
            } else if (season.equals("winter")) {
                budget = budget * 0.70;
                accommodationType = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                budget = budget * 0.40;
                accommodationType = "Camp";
            } else if (season.equals("winter")) {
                budget = budget * 0.80;
                accommodationType = "Hotel";
            }
        } else if (budget > 1000) {
            destination = "Europe";
            budget = budget * 0.90;
            accommodationType = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", accommodationType, budget);
    }
}
