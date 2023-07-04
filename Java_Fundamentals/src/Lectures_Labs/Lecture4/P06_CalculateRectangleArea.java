package Lectures_Labs.Lecture4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        printRectangleArea(getRectangleArea(w, h));

    }

    public static double getRectangleArea(double width, double height) {
        return width * height;
    }

    public static void printRectangleArea(double totalPrice) {
        String pattern = "0.###";
        DecimalFormat dm = new DecimalFormat(pattern);
        System.out.println(dm.format(totalPrice));
    }
}
