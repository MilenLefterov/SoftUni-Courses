package PB_Exams.PB2And3May2019;

import java.util.Scanner;

public class P02Safari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        double fuel = Double.parseDouble(scan.nextLine());
        String day = scan.nextLine();

        double total = fuel * 2.1 + 100;

        if (day.equals("Saturday")) {
            total *= 0.9;
        } else {
            total *= 0.8;
        }

        if (budget >= total) {
            System.out.printf("Safari time! Money left: %.2f lv. ", Math.abs(budget - total));
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", Math.abs(budget - total));
        }
    }
}
