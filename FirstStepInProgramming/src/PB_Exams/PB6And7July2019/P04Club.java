package PB_Exams.PB6And7July2019;

import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double target = Double.parseDouble(scan.nextLine());
        String cocktail = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());

        double sum = 0;

        while (!cocktail.equals("Party!") && sum < target) {

            double currentSum = quantity * cocktail.length();
            if (currentSum % 2 != 0)
                sum += currentSum * 0.75;
            else
                sum += currentSum;

            if (sum >= target) {
                System.out.println("Target acquired.");
                break;
            }

            cocktail = scan.nextLine();

            if (cocktail.equals("Party!")) {
                System.out.printf("We need %.2f leva more.\n", Math.abs(sum - target));
                break;
            }

            quantity = Integer.parseInt(scan.nextLine());
        }
        System.out.printf("Club income - %.2f leva.", sum);
    }
}
