package Exercises.Exercise1;

import java.util.Scanner;

public class P04_PrintAndSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startNum = Integer.parseInt(scan.nextLine());
        int endNum = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = startNum; i <= endNum; i++) {
            System.out.printf("%d ", i);
            sum += i;
        }

        System.out.printf("%nSum: %d", sum);

    }
}
