package Week3.Exercises;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flower = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double sum = 0;

        switch (flower) {
            case "Roses":
                if (quantity > 80) {
                    sum = (quantity * 5) * 0.90;
                } else sum = quantity * 5;
                break;
            case "Dahlias":
                if (quantity > 90) {
                    sum = (quantity * 3.80) * 0.85;
                } else
                    sum = quantity * 3.80;
                break;
            case "Tulips":
                if (quantity > 80) {
                    sum = (quantity * 2.80) * 0.85;
                } else
                    sum = quantity * 2.80;
                break;
            case "Narcissus":
                if (quantity < 120) {
                    sum = (quantity * 3) * 1.15;
                } else
                    sum = quantity * 3;
                break;
            case "Gladiolus":
                if (quantity < 80) {
                    sum = (quantity * 2.50) * 1.20;
                } else
                    sum = quantity * 2.50;
                break;
        }
        if (budget >= sum)
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flower, budget - sum);
        else
            System.out.printf("Not enough money, you need %.2f leva more.", sum - budget);
    }
}
