package Week6.MoreExercises;

import java.util.Scanner;

public class P01UniquePINCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= first; i++) {
            for (int j = 2; j <= second; j++) {
                for (int k = 1; k <= third; k++) {
                    boolean isPrime = true;
                    for (int l = 2; l < j - 1; l++) {
                        if (j % l == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (i % 2 == 0 && isPrime && k % 2 == 0)
                        System.out.printf("%d %d %d\n", i, j, k);
                }
            }
        }
    }
}
