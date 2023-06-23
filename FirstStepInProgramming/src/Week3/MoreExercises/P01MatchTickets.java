package Week3.MoreExercises;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String category = scan.nextLine();
        int numberOfPeople = Integer.parseInt(scan.nextLine());
        double price = 0;

        if (numberOfPeople >= 1 && numberOfPeople < 5)
            budget = budget * 0.25;
        else if (numberOfPeople >= 5 && numberOfPeople < 10)
            budget = budget * 0.40;
        else if (numberOfPeople >= 10 && numberOfPeople < 25)
            budget = budget * 0.50;
        else if (numberOfPeople >= 25 && numberOfPeople < 50)
            budget = budget * 0.60;
        else
            budget = budget * 0.75;


        if (category.equals("VIP")) {
            price = 499.99 * numberOfPeople;
            if (budget > price)
                System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - price));
            else
                System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - price));
        }
        else {
            price = 249.99 * numberOfPeople;
            if (budget > price)
                System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - price));
            else
                System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - price));
        }
    }
}
