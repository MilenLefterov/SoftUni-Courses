package Week6.MoreExercises;

import java.util.Scanner;

public class P04CarNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int stop = Integer.parseInt(scan.nextLine());

        for (int i = start; i <= stop; i++) {
            for (int j = start; j <= stop; j++) {
                for (int k = start; k <= stop; k++) {
                    for (int l = start; l <= stop; l++) {
                        if (i % 2 == 0 && l % 2 != 0 && i > l && (j + k) % 2 == 0)
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        else if (i % 2 != 0 && l % 2 == 0 && i > l && (j + k) % 2 == 0)
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                    }
                }
            }
        }
    }
}
