package Week5.Exercises;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        double pennies = Math.floor(money * 100);// !!!!! За да се избегне грешката на double при вход 0,56
                                                // умножено по 100 дава 56,000000001 при закръгляне надолу получаваме 56,0
                                                //избягваме зациклянето :)
        int coins = 0;

        while (pennies > 0) {
            if (pennies >= 200) {
                pennies -= 200;
                coins++;
            }else if (pennies >= 100) {
                pennies -= 100;
                coins++;
            }else if (pennies >= 50) {
                pennies -= 50;
                coins++;
            }else if (pennies >= 20) {
                pennies -= 20;
                coins++;
            }else if (pennies >= 10) {
                pennies -= 10;
                coins++;
            }else if (pennies >= 5) {
                pennies -= 5;
                coins++;
            }else if (pennies >= 2) {
                pennies -= 2;
                coins++;
            }else if (pennies >= 1) {
                pennies -= 1;
                coins++;
            }
        }

        System.out.println(coins);

    }
}
