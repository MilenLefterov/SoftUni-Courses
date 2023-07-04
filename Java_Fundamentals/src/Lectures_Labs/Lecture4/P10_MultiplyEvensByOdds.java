package Lectures_Labs.Lecture4;

import java.util.Scanner;

public class P10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Math.abs(Integer.parseInt(scan.nextLine()));
        printResult(Integer.toString(getMultipleOfEvensAndOdds(num)));
    }

    public static int getMultipleOfEvensAndOdds(int n) {
        return getSumOfEvensDigits(n) * getSumOfOddDigits(Integer.toString(n));
    }

    public static int getSumOfEvensDigits(int n) {
        int sum = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                sum += n % 10;
            }
            n = n / 10;
        }
        return sum;
    }

    public static int getSumOfOddDigits(String textN) {
        String[] arrNum = textN.split("");
        int sum = 0;
        for (int i = 0; i < arrNum.length; i++) {
            if (Integer.parseInt(arrNum[i]) % 2 != 0) {
                sum += Integer.parseInt(arrNum[i]);
            }
        }
        return sum;
    }

    public static void printResult(String text) {
        System.out.println(text);
    }
}
