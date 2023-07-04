package Exercises.Exercise2;

import java.util.Scanner;

public class P10_PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pokePower = Integer.parseInt(scan.nextLine());// N
        int distance = Integer.parseInt(scan.nextLine());// M
        int exhaustionFactor = Integer.parseInt(scan.nextLine());// Y
        int halfOriginalPower = pokePower / 2;

        int targets = 0;
        while (pokePower >= distance) {
            targets++;
            pokePower -= distance;

            if ((pokePower == halfOriginalPower) && exhaustionFactor != 0) {
                pokePower /= exhaustionFactor;
            }
        }

        System.out.println(pokePower);
        System.out.println(targets);
    }
}
