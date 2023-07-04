package Exercises.Exercise4;

import java.util.Scanner;

public class P08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());

        printDivideOfFactorial(getFactorial(n1), getFactorial(n2));

    }

    public static long getFactorial(int n) {
        long result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }

    public static void printDivideOfFactorial(long f1, long f2) {
        System.out.printf("%.2f", f1 * 1.0 / f2);
    }
}
