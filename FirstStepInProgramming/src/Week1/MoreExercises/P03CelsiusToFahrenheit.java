package Week1.MoreExercises;

import java.util.Scanner;

public class P03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            Напишете програма, която чете градуси по скалата на Целзий (°C) и ги преобразува до градуси по скалата на Фаренхайт (°F).
            Потърсете в Интернет подходяща формула, с която да извършите изчисленията.
            Форматирате изхода до втория знак след десетичната запетая.

        */

        double c = Double.parseDouble(scan.nextLine());
        double Fahrenheit = c * 1.8 + 32;

        System.out.printf("%.2f", Fahrenheit);

    }
}
