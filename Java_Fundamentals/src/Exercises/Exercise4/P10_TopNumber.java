package Exercises.Exercise4;

import java.util.Scanner;

public class P10_TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        printTopNumber(n);

    }

    public static void printTopNumber(int n) {
        for (int i = 8; i <= n; i++) {
            int currentNum = i;

            int sumOfDigits = 0;
            boolean oddDigit = false;
            while (currentNum > 0) {
                int lastNum = currentNum % 10;
                if (lastNum % 2 != 0) {
                    oddDigit = true;
                }
                sumOfDigits += lastNum;
                currentNum /= 10;
            }

            if (oddDigit && sumOfDigits % 8 == 0) {
                System.out.println(i);
            }
        }

    }
}
