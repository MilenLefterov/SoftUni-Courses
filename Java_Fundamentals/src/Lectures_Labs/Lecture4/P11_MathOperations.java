package Lectures_Labs.Lecture4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numFirst = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int numSecond = Integer.parseInt(scan.nextLine());

        printResult(calc(numFirst, operator, numSecond));
    }

    private static double calc(int n1, String opr, int n2) {
        switch (opr) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                return (n1 * 1.0) / n2;
        }
        return 0.0;
    }

    private static void printResult(double result) {
        String pattern = "0.###";
        DecimalFormat dm = new DecimalFormat(pattern);
        System.out.println(dm.format(result));
    }
}
