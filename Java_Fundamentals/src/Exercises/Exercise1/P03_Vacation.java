package Exercises.Exercise1;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        String groupType = scan.nextLine();
        String days = scan.nextLine();

        double totalPrice = 0;

        double studentsDiscount = 0.85; // 15%
        int businessDiscount = 10; // 10 people stay for free
        double regularDiscount = 0.95; // 5%

        switch (groupType) {
            case "Students":
                if ("Friday".equals(days)) {
                    totalPrice = 8.45;
                } else if ("Saturday".equals(days)) {
                    totalPrice = 9.80;
                } else {
                    totalPrice = 10.46;
                }

                if (people >= 30) {
                    totalPrice = (totalPrice * people) * studentsDiscount;
                } else {
                    totalPrice = totalPrice * people;
                }

                break;

            case "Business":
                if ("Friday".equals(days)) {
                    totalPrice = 10.90;
                } else if ("Saturday".equals(days)) {
                    totalPrice = 15.60;
                } else {
                    totalPrice = 16;
                }

                if (people >= 100) {
                    totalPrice = totalPrice * (people - businessDiscount);
                } else {
                    totalPrice = totalPrice * people;
                }

                break;

            case "Regular":
                if ("Friday".equals(days)) {
                    totalPrice = 15;
                } else if ("Saturday".equals(days)) {
                    totalPrice = 20;
                } else {
                    totalPrice = 22.50;
                }

                if (people >= 10 && people <= 20) {
                    totalPrice = (totalPrice * people) * regularDiscount;
                } else {
                    totalPrice = totalPrice * people;
                }

                break;
        }

        System.out.printf("Total price: %.2f", totalPrice);

    }
}
