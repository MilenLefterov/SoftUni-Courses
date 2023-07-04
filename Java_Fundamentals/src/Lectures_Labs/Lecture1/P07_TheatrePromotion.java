package Lectures_Labs.Lecture1;

import java.util.Scanner;

public class P07_TheatrePromotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());

        int price = 0;

        if (age >= 0 && age <= 18) {
            if (day.equals("Weekday")) {
                price = 12;
            } else if (day.equals("Weekend")) {
                price = 15;
            } else {
                price = 5;
            }
        } else if (age > 18 && age <= 64) {
            if (day.equals("Weekday")) {
                price = 18;
            } else if (day.equals("Weekend")) {
                price = 20;
            } else {
                price = 12;
            }
        } else if (age >64 && age <= 122) {
            if (day.equals("Weekday")) {
                price = 12;
            } else if (day.equals("Weekend")) {
                price = 15;
            } else {
                price = 10;
            }
        } else {
            System.out.println("Error!");
        }

        if (price != 0) {
            System.out.printf("%d$", price);
        }
    }
}
