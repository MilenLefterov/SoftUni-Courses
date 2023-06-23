package Week3.Exercises;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int countFishermen = Integer.parseInt(scan.nextLine());
        double sum = 0;

        if (season.equals("Spring")) {
            sum = 3000;
        } else if (season.equals("Summer")) {
            sum = 4200;
        } else if (season.equals("Autumn")) {
            sum = 4200;
        } else if (season.equals("Winter")) {
            sum = 2600;
        }

        if (countFishermen % 2 == 0 && !season.equals("Autumn")) {
            sum = sum * 0.95;
        }

        if (countFishermen <= 6) {
            sum = sum * 0.90;
        } else if (countFishermen <= 11) {
            sum = sum * 0.85;
        } else if (countFishermen > 12) {
            sum = sum * 0.75;
        }

        if (budget >= sum)
            System.out.printf("Yes! You have %.2f leva left.", budget - sum);
        else
            System.out.printf("Not enough money! You need %.2f leva.", sum - budget);
    }
}
