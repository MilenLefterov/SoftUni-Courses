package PB_Exams.PB15And16June2019;

import java.util.Scanner;

public class P03MovieDestination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String destination = scan.nextLine();
        String season = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        double sum = 0;


        switch (destination) {
            case "Dubai":
                if (season.equals("Winter")) {
                    sum = 45000;
                } else {
                    sum = 40000;
                }
                break;
            case "Sofia":
                if (season.equals("Winter")) {
                    sum = 17000;
                } else {
                    sum = 12500;
                }
                break;
            case "London":
                if (season.equals("Winter")) {
                    sum = 24000;
                } else {
                    sum = 20250;
                }
                break;
        }
        sum *= days;
        if (destination.equals("Dubai")) {
            sum *= 0.70;
        } else if (destination.equals("Sofia")) {
            sum *= 1.25;
        }
        if (budget >= sum) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", Math.abs(budget - sum));
        }else {
            System.out.printf("The director needs %.2f leva more!", Math.abs(budget - sum));
        }
    }
}
