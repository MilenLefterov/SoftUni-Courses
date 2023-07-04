package Lectures_Labs.Lecture3;

import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;
import java.util.Scanner;

public class P05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt) // .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int evenSum = 0;
        int oddSum = 0;


        for (int i : numbersArr) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println(evenSum - oddSum);
    }
}
