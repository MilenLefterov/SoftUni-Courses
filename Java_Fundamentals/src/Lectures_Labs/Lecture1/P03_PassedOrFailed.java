package Lectures_Labs.Lecture1;

import java.util.Scanner;

public class P03_PassedOrFailed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());

        if (grade >= 3.00) {
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }

    }
}
