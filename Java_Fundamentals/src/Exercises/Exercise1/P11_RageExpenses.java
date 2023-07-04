package Exercises.Exercise1;

import java.util.Scanner;

public class P11_RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        double total = 0.00;

        total += Math.floor(lostGamesCount / 2.00) * headsetPrice;
        total += Math.floor(lostGamesCount / 3.00) * mousePrice;
        total += Math.floor(lostGamesCount / 6.00) * keyboardPrice;
        total += Math.floor(lostGamesCount / 12.00) * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", total);

    }
}
