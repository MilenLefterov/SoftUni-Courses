package Exercises.Exercise8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P05_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNum = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());

        System.out.print(multyply(firstNum, multiplier));
    }

    public static String multyply(String str1, int multiplier) {
        StringBuilder result = new StringBuilder();

        if (multiplier == 0) {
            return "0";
        } else {
            int onMind = 0;

            for (int i = str1.length() - 1; i >= 0; i--) {
                int digit = Integer.parseInt(str1.charAt(i) + "");
                int currentResult = digit * multiplier + onMind;

                result.insert(0, currentResult % 10);
                onMind = currentResult / 10;
            }

            if (onMind != 0) {
                result.insert(0, onMind);
            }
        }

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '0') {
                result.delete(0, 1);
                i--;
            } else {
                break;
            }
        }

        if (result.length() == 0) {
            result.append("0");
        }

        return result.toString();
    }
}
