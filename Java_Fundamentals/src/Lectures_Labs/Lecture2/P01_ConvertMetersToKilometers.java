package Lectures_Labs.Lecture2;

import java.util.Scanner;

public class P01_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int meters = Integer.parseInt(scan.nextLine());

        System.out.printf("%.2f", meters / 1000.0);
    }
}
