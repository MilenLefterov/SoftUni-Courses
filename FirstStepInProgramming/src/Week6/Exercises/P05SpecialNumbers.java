package Week6.Exercises;

import java.util.Scanner;

public class P05SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

//        for (int i = 1111; i <= 9999; i++) {
//
//            int firstDigit = i / 1000;
//            int secondDigit = i / 100 % 10;
//            int thirdDigit = i / 10 % 10;
//            int forthDigit = i % 10;
//
//            if (secondDigit == 0 || thirdDigit == 0 || forthDigit == 0)
//                continue;
//
//            if (n % firstDigit == 0 && n % secondDigit == 0 && n % thirdDigit == 0 && n % forthDigit == 0)
//                System.out.printf("%d ", i);
//
//        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (n % i == 0 && n % j == 0 && n % k == 0 && n % l == 0)
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                    }
                }
            }
        }
    }
}
