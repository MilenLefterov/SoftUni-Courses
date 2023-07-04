package Lectures_Labs.Lecture4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08_MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        double power = Double.parseDouble(scan.nextLine());

        printResult(getPower(num, power));
    }

    public static double getPower(double n, double p) {
        return Math.pow(n, p);
    }

    public static void printResult(double totalPrice) {
        String pattern = "0.####";
        DecimalFormat dm = new DecimalFormat(pattern);
        System.out.println(dm.format(totalPrice));
    }
}
