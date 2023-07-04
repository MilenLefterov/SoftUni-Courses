package Lectures_Labs.Lecture2;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        BigDecimal exactSum = new BigDecimal("0");

        for (int i = 0; i < n; i++) {
            BigDecimal currentNum = new BigDecimal(scan.nextLine());
            exactSum = exactSum.add(currentNum);
        }

        System.out.println(exactSum); // to US
    }
}
