package PB_Exams.PB15And16June2019;

import java.util.Scanner;

public class P04MovieStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String command = scan.nextLine();

        while (!command.equals("ACTION")) {
            if (command.length() <= 15) {
                budget -= Double.parseDouble(scan.nextLine());// Reward
            } else {
                budget *= 0.8;
            }

            if (budget < 0) {
                break;
            }

            command = scan.nextLine();
        }
        if (budget >= 0) {
            System.out.printf("We are left with %.2f leva.", budget);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }
    }
}
