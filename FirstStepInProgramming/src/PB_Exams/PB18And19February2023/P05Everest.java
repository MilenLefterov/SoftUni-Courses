package PB_Exams.PB18And19February2023;

import java.util.Scanner;

public class P05Everest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int meters = 5364;
        int target = 8848;

        int maxDays = 5;
        int day = 1;

        boolean flag = false;

        String input = scan.nextLine();

        while (!"END".equals(input)) {

            if ("Yes".equals(input)) {
                day++;

                if (day > maxDays) {
                    System.out.printf("Failed!\n%d", meters);
                    flag = true;
                }
            }

            meters += Integer.parseInt(scan.nextLine());

            if (flag) {
                break;
            }
            if (meters >= target) {
                System.out.printf("Goal reached for %d days!", day);
                break;
            }
            input = scan.nextLine();
        }

        if ("END".equals(input)) {

                System.out.printf("Failed!\n%d", meters);

        }
    }
}
