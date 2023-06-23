package Week4.MoreExercises;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLoads = Integer.parseInt(scan.nextLine());

        int averagePrice = 0;
        int totalTons = 0;
        int van = 0;
        int truck = 0;
        int train = 0;

        for (int i = 1; i <= numberOfLoads; i++) {
            int ton = Integer.parseInt(scan.nextLine());

            if (ton < 4) {
                van += ton;
                averagePrice += ton * 200;
            } else if (ton < 12) {
                truck += ton;
                averagePrice += ton * 175;

            } else {
                train += ton;
                averagePrice += ton * 120;
            }
            totalTons += ton;
        }

        System.out.printf("%.2f\n", averagePrice * 1.0 / totalTons);
        System.out.printf("%.2f%%\n", ((van * 1.0) / totalTons) * 100);
        System.out.printf("%.2f%%\n", ((truck * 1.0) / totalTons) * 100);
        System.out.printf("%.2f%%\n", ((train * 1.0) / totalTons) * 100);
    }
}
