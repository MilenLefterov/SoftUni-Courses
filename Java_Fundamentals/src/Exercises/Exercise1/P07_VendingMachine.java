package Exercises.Exercise1;

import java.util.Scanner;

public class P07_VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double total = 0;

        while (!"Start".equals(input)) {
            switch (input) {
                case "0.1":
                    total += 0.1;
                    break;
                case "0.2":
                    total += 0.2;
                    break;
                case "0.5":
                    total += 0.5;
                    break;
                case "1":
                    total += 1;
                    break;
                case "2":
                    total += 2;
                    break;
                default:
                    System.out.printf("Cannot accept %.2f\n", Double.parseDouble(input));
                    break;
            }
            input = scan.nextLine();
        }

        input = scan.nextLine();

        while (!"End".equals(input)) {
            switch (input) {
                case "Nuts":
                    if (total - 2 >= 0) {
                        total -= 2;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (total - 0.7 >= 0) {
                        total -= 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (total - 1.5 >= 0) {
                        total -= 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (total - 0.8 >= 0) {
                        total -= 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (total - 1 >= 0) {
                        total -= 1;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scan.nextLine();
        }

        System.out.printf("Change: %.2f\n", total);
    }
}
