package PB_Exams.PB2And3May2019;

import java.util.Scanner;

public class P05DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 1; i <= n; i++) {
            int currentN = Integer.parseInt(scan.nextLine());
            if (currentN % 2 == 0) {
                p1++;
            }
            if (currentN % 3 == 0) {
                p2++;
            }
            if (currentN % 4 == 0) {
                p3++;
            }
        }
            System.out.printf("%.2f%%\n", (p1 / n) *100);
            System.out.printf("%.2f%%\n", (p2 / n) *100);
            System.out.printf("%.2f%%", (p3 / n) *100);
    }
}
