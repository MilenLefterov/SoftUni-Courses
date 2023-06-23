package PB_Exams.PB2And3May2019;

import java.util.Scanner;

public class P04TouristShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String command = scan.nextLine();
        double sum = 0;
        int count = 0;
        boolean flag = false;

        while (!command.equals("Stop")) {
            double price = Double.parseDouble(scan.nextLine());
            count++;
            if (count > 1 && count % 3 == 0) {
                sum += price / 2;
            } else {
                sum += price;
            }
            if (sum > budget) {
                flag = true;
                break;
            }

            command = scan.nextLine();
        }

        if (command.equals("Stop")) {
            System.out.printf("You bought %d products for %.2f leva.", count, sum);
        }

        if (flag) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", Math.abs(budget - sum));
        }
    }
}

