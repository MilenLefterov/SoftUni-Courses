package Week4.MoreExercises;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int student = Integer.parseInt(scan.nextLine());

        int s2 = 0;
        int s3 = 0;
        int s4 = 0;
        int s5 = 0;
        double average = 0;

        for (int i = 1; i <= student; i++) {
            double score = Double.parseDouble(scan.nextLine());

            if (score < 3) {
                s2++;
            } else if (score < 4) {
                s3++;
            } else if (score < 5) {
                s4++;
            } else
                s5++;

            average += score;
        }

        System.out.printf("Top students: %.2f%%\n", ((s5 * 1.0) / student) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", ((s4 * 1.0) / student) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", ((s3 * 1.0) / student) * 100);
        System.out.printf("Fail: %.2f%%\n", ((s2 * 1.0) / student) * 100);
        System.out.printf("Average: %.2f\n", average * 1.0 / student);

    }
}
