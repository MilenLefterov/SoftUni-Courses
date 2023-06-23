package Week6.MoreExercises;

import java.util.Scanner;

public class P10Profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int one = Integer.parseInt(scan.nextLine());
        int tow = Integer.parseInt(scan.nextLine());
        int five = Integer.parseInt(scan.nextLine());
        int sum = Integer.parseInt(scan.nextLine());

        for (int k = 0; k <= one; k++) {
            for (int j = 0; j <= tow; j++) {
                for (int i = 0; i <= five; i++) {
                    if (((i * 5) + (j * 2) + k) == sum)
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", k, j, i, sum);
                }
            }
        }
    }
}
