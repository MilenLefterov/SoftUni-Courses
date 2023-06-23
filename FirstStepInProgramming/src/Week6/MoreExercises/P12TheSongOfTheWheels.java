package Week6.MoreExercises;

import java.util.Scanner;

public class P12TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = Integer.parseInt(scan.nextLine());
        int count = 0;
        String pass = "";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (((i < j) && (k > l)) && ((i * j) + (k * l)) == m) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                            count++;
                            if (count == 4) {
                                pass = Integer.toString(i) + Integer.toString(j) + Integer.toString(k) + Integer.toString(l);
                            }
                        }
                    }
                }
            }
        }
        if (pass.length() > 0) {
            System.out.printf("\nPassword: %s", pass);
        } else if (count == 0) {
            System.out.println("No!");
        }else {
            System.out.println("\nNo!");
        }
    }
}
