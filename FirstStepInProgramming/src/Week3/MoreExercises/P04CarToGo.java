package Week3.MoreExercises;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String carClass = "";
        String carType = "";

        if (budget <= 100) {
            carClass = "Economy class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                budget = budget * 0.35;
            } else {
                carType = "Jeep";
                budget = budget * 0.65;
            }
        } else if (budget <= 500) {
            carClass = "Compact class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                budget = budget * 0.45;
            } else {
                carType = "Jeep";
                budget = budget * 0.80;
            }
        } else {
            carClass = "Luxury class";
            carType = "Jeep";
            budget = budget * 0.90;
        }

        System.out.printf("%s\n", carClass);
        System.out.printf("%s - %.2f", carType, budget);

    }
}
