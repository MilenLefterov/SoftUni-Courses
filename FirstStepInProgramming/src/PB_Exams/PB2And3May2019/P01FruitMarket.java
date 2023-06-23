package PB_Exams.PB2And3May2019;

import java.util.Scanner;

public class P01FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scan.nextLine());
        double bananasInKilograms = Double.parseDouble(scan.nextLine());
        double orangesInKilograms = Double.parseDouble(scan.nextLine());
        double raspberriesInKilograms = Double.parseDouble(scan.nextLine());
        double strawberriesInKilograms = Double.parseDouble(scan.nextLine());

        double sum = (strawberriesPrice / 2) * raspberriesInKilograms +
                ((strawberriesPrice / 2) * 0.6) * orangesInKilograms +
                ((strawberriesPrice / 2) * 0.2) * bananasInKilograms +
                strawberriesPrice * strawberriesInKilograms;

        System.out.printf("%.2f", sum);
    }
}
