package Week2.Exercises;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int numberOfVideoCards = Integer.parseInt(scan.nextLine());
        int numberOfCPUs = Integer.parseInt(scan.nextLine());
        int numberOfRAMs = Integer.parseInt(scan.nextLine());

        double priceOfVideoCards = numberOfVideoCards * 250;
        double priceOfCPUs = priceOfVideoCards * 0.35;
        double priceOfRAMs = priceOfVideoCards * 0.1;

        double totalPrice = priceOfVideoCards +
                priceOfCPUs * numberOfCPUs +
                priceOfRAMs * numberOfRAMs;

        if(numberOfVideoCards > numberOfCPUs)
            totalPrice = totalPrice * 0.85;

        if (budget >= totalPrice)
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        else
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
    }
}
