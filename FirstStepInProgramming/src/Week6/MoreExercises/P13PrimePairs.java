package Week6.MoreExercises;

import java.util.Scanner;

public class P13PrimePairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstCouple = Integer.parseInt(scan.nextLine());
        int secondCouple = Integer.parseInt(scan.nextLine());
        int firstStop = Integer.parseInt(scan.nextLine());
        int secondStop = Integer.parseInt(scan.nextLine());

        for (int i = firstCouple; i <= firstCouple + firstStop; i++) {
            for (int j = secondCouple; j <= secondCouple + secondStop; j++) {

                boolean isPrimeFirstCouple = true;
                boolean isPrimeSecondCouple = true;

                for (int k = 2; k < i - 1; k++) {
                    if (i % k == 0) {
                        isPrimeFirstCouple = false;
                        break;
                    }
                }

                for (int l = 2; l < j - 1; l++) {
                    if (j % l == 0) {
                        isPrimeSecondCouple = false;
                        break;
                    }
                }

                if (isPrimeFirstCouple && isPrimeSecondCouple) {
                    System.out.printf("%d%d\n", i, j);

                }
            }
        }

    }
}
