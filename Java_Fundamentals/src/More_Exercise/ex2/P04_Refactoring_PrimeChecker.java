package More_Exercise.ex2;

import java.util.Scanner;

public class P04_Refactoring_PrimeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int end = Integer.parseInt(scan.nextLine());

        for (int i = 2; i <= end; i++) {

            boolean isItTrue = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isItTrue = false;
                    break;
                }
            }

            System.out.printf("%d -> %b%n", i, isItTrue);
        }
    }
}
