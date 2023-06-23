package Week1.MoreExercises;

import java.util.Scanner;

public class P01TrapeziodArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            Напишете програма, която чете от конзолата три дробни числа b1, b2 и h и
            пресмята лицето на трапец с основи b1 и b2 и височина h.
                Формулата за лице на трапец е (b1 + b2) * h / 2.
            Отговорът трябва да е форматиран до втората цифра след десетичния знак.

        */

        double b1 = Double.parseDouble(scan.nextLine());
        double b2 = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        //лицето на трапеца:
        double tArea = (b1 + b2) * h / 2;

        System.out.printf("%.2f", tArea);

    }
}
