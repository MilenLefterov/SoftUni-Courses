package Week1.Exercises;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            1.	Дължина в см – цяло число в интервала [10 … 500]
            2.	Широчина в см – цяло число в интервала [10 … 300]
            3.	Височина в см – цяло число в интервала [10… 200]
            4.	Процент  – реално число в интервала [0.000 … 100.000]
        */

        int Length = Integer.parseInt(scan.nextLine());
        int Width = Integer.parseInt(scan.nextLine());
        int Height = Integer.parseInt(scan.nextLine());
        double Percentage = Double.parseDouble(scan.nextLine());

        //обем на аквариумa:
        double volume = Length * Width * Height;
        //обем в литри:
        double volumeInLiters = volume / 1000;

        // Нужни литри:
        System.out.println(volumeInLiters * (1 - (Percentage * 0.01)));

    }
}
