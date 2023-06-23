package Week1.MoreExercises;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            Градинар продавал реколтата от градината си на зеленчуковата борса.
            Продава зеленчуци за N лева на килограм и плодове за M лева за килограм.
            Напишете програма, която да пресмята приходите от реколтата в евро ( ако приемем, че едно евро е равно на 1.94лв).

            Да се отпечата на конзолата едно число: приходите от всички плодове и зеленчуци в евро.
            Резултата да се форматира до втория знак след десетичния разделител.

        */

        double priceForKgOfVegetables = Double.parseDouble(scan.nextLine());
        double priceForKgOfFruits = Double.parseDouble(scan.nextLine());
        int totalKgOfVegetables = Integer.parseInt(scan.nextLine());
        int totalKgOfFruits = Integer.parseInt(scan.nextLine());

        double sum = priceForKgOfVegetables * totalKgOfVegetables + priceForKgOfFruits * totalKgOfFruits;
        double eur = sum / 1.94;

        System.out.printf("%.2f", eur);

    }
}
