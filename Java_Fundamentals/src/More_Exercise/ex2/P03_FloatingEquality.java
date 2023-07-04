package More_Exercise.ex2;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = Double.parseDouble(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());

        double eps = 0.000001;

        boolean result = Math.abs(num1 - num2) < eps;

        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
