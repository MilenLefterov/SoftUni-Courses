package Week4.MoreExercises;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int capacity = Integer.parseInt(scan.nextLine());
        int number = Integer.parseInt(scan.nextLine());

        double a = 0;
        double b = 0;
        double v = 0;
        double g = 0;

        for (int i = 1; i <= number; i++) {
            String sector = scan.nextLine();

            switch (sector) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "V":
                    v++;
                    break;
                case "G":
                    g++;
                    break;

            }

        }

        System.out.printf("%.2f%%\n", (a / number) * 100);
        System.out.printf("%.2f%%\n", (b / number) * 100);
        System.out.printf("%.2f%%\n", (v / number) * 100);
        System.out.printf("%.2f%%\n", (g / number) * 100);
        System.out.printf("%.2f%%\n", ((number * 1.0) / capacity) * 100);

    }
}
