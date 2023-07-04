package Lectures_Labs.Lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class P01_SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        signOfIntegerNumbers(n);
    }

    public static void signOfIntegerNumbers(int num) {
        String sign = "";
        if (num < 0) {
            sign = "negative";
        } else if (num == 0) {
            sign = "zero";
        } else {
            sign = "positive";
        }

        System.out.printf("The number %d is %s.\n", num, sign);
    }
}
