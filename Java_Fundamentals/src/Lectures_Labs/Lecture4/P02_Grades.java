package Lectures_Labs.Lecture4;

import java.util.Scanner;

public class P02_Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n = Double.parseDouble(scan.nextLine());

        grade(n);
    }

    public static void grade(double num) {
        String gradeName = "";
        if (num >= 2.00 && num <= 2.99) {
            gradeName = "Fail";
        } else if (num >= 3.00 && num <= 3.49) {
            gradeName = "Poor";
        } else if (num >= 3.50 && num <= 4.49) {
            gradeName = "Good";
        } else if (num >= 4.50 && num <= 5.49) {
            gradeName = "Very good";
        } else if (num >= 5.50 && num <= 6.00) {
            gradeName = "Excellent";
        }

        System.out.println(gradeName);
    }
}
