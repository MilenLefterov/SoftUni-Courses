package Week2.MoreExercises;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = Integer.parseInt(scan.nextLine()); //квадратни метри
        double y = Double.parseDouble(scan.nextLine()); //килограма грозде
        int z = Integer.parseInt(scan.nextLine()); //нужни литри вино
        int numberOfWorkers = Integer.parseInt(scan.nextLine());

        double wine = 0.4 * x * y / 2.5;

        if (wine < z)
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",
                    Math.floor(z - wine));
        else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n",
                    Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",
                    Math.ceil(wine - z), Math.ceil((wine - z) / numberOfWorkers));
        }
    }
}
