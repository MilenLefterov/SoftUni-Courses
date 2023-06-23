package Week6.MoreExercises;

import java.util.Scanner;

public class P07SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = 35;
        int B = 64;
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());
        int max = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if (A > 55) {
                    A = 35;
                }
                if (B > 96) {
                    B = 64;
                }

                System.out.printf("%s%s%d%d%s%s|", (char) A, (char) B, i, j, (char) B, (char) A);

                if (max == 1) {
                    break;
                }

                A++;
                B++;
                max--;
            }
            if (max == 1) {
                break;
            }
        }
    }
}