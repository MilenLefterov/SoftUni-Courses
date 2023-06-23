package Week4.MoreExercises;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int moves = Integer.parseInt(scan.nextLine());

        double score = 0;
        int s0 = 0; //•	От 0 до 9
        int s1 = 0; //•	От 10 до 19
        int s2 = 0; //•	От 20 до 29
        int s3 = 0; //•	От 30 до 39
        int s4 = 0; //•	От 40 до 50
        int invalid = 0;

        for (int i = 1; i <= moves; i++) {
            double num = Double.parseDouble(scan.nextLine());

            if (num >= 0 && num < 10) {
                s0++;
                score += num * 0.2;
            } else if (num >= 0 && num < 20) {
                s1++;
                score += num * 0.3;
            } else if (num >= 0 && num < 30) {
                s2++;
                score += num * 0.4;
            } else if (num >= 0 && num < 40) {
                s3++;
                score += 50;
            } else if (num >= 0 && num <= 50) {
                s4++;
                score += 100;
            } else {
                invalid++;
                score /= 2;
            }
        }

        System.out.printf("%.2f\n", score);
        System.out.printf("From 0 to 9: %.2f%%\n", ((s0 * 1.0) / moves) * 100);
        System.out.printf("From 10 to 19: %.2f%%\n", ((s1 * 1.0) / moves) * 100);
        System.out.printf("From 20 to 29: %.2f%%\n", ((s2 * 1.0) / moves) * 100);
        System.out.printf("From 30 to 39: %.2f%%\n", ((s3 * 1.0) / moves) * 100);
        System.out.printf("From 40 to 50: %.2f%%\n", ((s4 * 1.0) / moves) * 100);
        System.out.printf("Invalid numbers: %.2f%%\n", (invalid * 1.0 / moves) * 100);

    }
}
