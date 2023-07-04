package More_Exercise.ex2;

import java.util.Scanner;

public class P02_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();

            long leftTempNum = Long.parseLong(input.substring(0, input.indexOf(' ')));
            long rightTempNum = Long.parseLong(input.substring(input.indexOf(' ') + 1, input.length()));

            long bigNum = leftTempNum;
            if (leftTempNum < rightTempNum) {
                bigNum = rightTempNum;
            }
            long sumOfDigits = 0;

            while (bigNum != 0) {
                sumOfDigits += bigNum % 10;
                bigNum /= 10;
            }

            System.out.println(Math.abs(sumOfDigits));

        }
    }
}
