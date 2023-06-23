package Week6.Exercises;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {

            int firstDigit = i / 100000;
            int secondDigit = i / 10000 % 10;
            int thirdDigit = i / 1000 % 10;
            int forthDigit = i / 100 % 10;
            int fifthDigit = i / 10 % 10;
            int sixthDigit = i % 10;

            if(firstDigit + thirdDigit + fifthDigit == secondDigit + forthDigit + sixthDigit)
                System.out.printf("%d ", i);

        }
    }
}
