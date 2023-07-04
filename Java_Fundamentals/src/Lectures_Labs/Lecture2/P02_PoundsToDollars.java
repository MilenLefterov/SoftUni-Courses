package Lectures_Labs.Lecture2;

import java.util.Scanner;

public class P02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double ponds = Double.parseDouble(scan.nextLine());

        System.out.printf("%.3f", ponds * 1.36); // to US
    }
}
