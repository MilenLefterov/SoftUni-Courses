package Exercises.Exercise8;

import java.math.BigInteger;
import java.util.Scanner;

public class P05_MultiplyBigNumberWithBigIntegerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger secondNum = new BigInteger(scanner.nextLine());


        System.out.print(firstNum.multiply(secondNum));
    }
}
