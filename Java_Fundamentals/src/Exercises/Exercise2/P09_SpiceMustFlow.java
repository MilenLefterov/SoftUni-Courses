package Exercises.Exercise2;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());// expected initial yield

        int forWorkers = 26;
        int totalYield = 0;
        int days = 0;
        while (n >= 100) {
            days++;
            totalYield += n - forWorkers;
            n -= 10;
        }
        if (totalYield > forWorkers) {
            totalYield -= forWorkers;// additional 26 after the mine has been exhausted.
        }
        System.out.println(days);
        System.out.println(totalYield);
    }
}
