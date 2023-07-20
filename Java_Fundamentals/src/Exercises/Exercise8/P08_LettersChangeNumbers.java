package Exercises.Exercise8;

import java.util.Scanner;

public class P08_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputDataArr = scanner.nextLine().split("\\s+");
        double result = 0.0;

        for (String e : inputDataArr) {
            char firstLater = e.charAt(0);
            char lastLater = e.charAt(e.length() - 1);
            double number = Double.parseDouble(e.substring(1, e.length() - 1));

            if (Character.isUpperCase(firstLater)) {
                result += number / (firstLater - 64);
            } else {
                result += number * (firstLater - 96);
            }

            if (Character.isUpperCase(lastLater)) {
                result -= (lastLater - 64);
            } else {
                result += (lastLater - 96);
            }
        }

        System.out.printf("%.2f", result);
    }
}
