package Week3.MoreExercises;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfChrysanthemums = Integer.parseInt(scan.nextLine());
        int numberOfRoses = Integer.parseInt(scan.nextLine());
        int numberOfTulips = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        String holiday = scan.nextLine();

        double sum = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                sum = numberOfChrysanthemums * 2.00;
                sum = sum+ numberOfRoses * 4.10;
                sum = sum + numberOfTulips * 2.50;
                break;
            case "Autumn":
            case "Winter":
                sum =  numberOfChrysanthemums * 3.75;
                sum = sum+numberOfRoses * 4.50;
                sum =sum + numberOfTulips * 4.15;
                break;
        }

        if (holiday.equals("Y"))
            sum = sum * 1.15;

        if (numberOfTulips > 7 && season.equals("Spring"))
            sum = sum * 0.95;

        if (numberOfRoses >= 10 && season.equals("Winter"))
            sum = sum * 0.90;

        if (numberOfChrysanthemums + numberOfRoses + numberOfTulips > 20)
            sum = sum * 0.8;

        System.out.printf("%.2f", sum + 2);
    }
}
