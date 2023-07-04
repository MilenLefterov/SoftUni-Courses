package Exercises.Exercise1;

import java.util.Scanner;

public class P06_StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();
        int sum = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            int currentNum = Character.getNumericValue(number.charAt(i));
            int currentSum = 1;

            for (int j = currentNum; j >= 1; j--) {
                currentSum *= j;
            }
            sum += currentSum;
        }

        if (sum == Integer.parseInt(number)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
