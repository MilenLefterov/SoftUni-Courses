package Lectures_Labs.Lecture4;

import java.util.Scanner;

public class P05_Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());

        printTotalPrice(calculatePrice(productsPrice(item), quantity));

    }

    public static double productsPrice(String name) {
        switch (name) {
            case "coffee":
                return 1.50;
            case "water":
                return 1.00;
            case "coke":
                return 1.40;
            case "snacks":
                return 2.00;
        }
        return 0;
    }

    public static double calculatePrice(double price, double quantity) {

        return price * quantity;
    }

    public static void printTotalPrice(double totalPrice) {
        System.out.printf("%.2f", totalPrice);
    }

}
