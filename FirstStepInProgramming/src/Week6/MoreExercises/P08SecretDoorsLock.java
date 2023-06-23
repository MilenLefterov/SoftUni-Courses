package Week6.MoreExercises;

import java.util.Scanner;

public class P08SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hundreds = Integer.parseInt(scan.nextLine());
        int dozens = Integer.parseInt(scan.nextLine());
        int units = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= hundreds; i++) {
            if (i % 2 != 0)
                continue;
            for (int j = 1; j <= dozens; j++) {
                if (j < 2 || j > 7)
                    continue;
                for (int k = 1; k <= units; k++) {
                    if (k % 2 != 0)
                        continue;

                    boolean isPrime = true;

                    for (int l = 2; l <= j - 1; l++) {
                        if (j % l == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime)
                        System.out.printf("%d %d %d\n", i, j, k);
                }
            }
        }
    }
}

