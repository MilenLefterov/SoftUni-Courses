package Lectures_Labs.Lecture3;

import java.util.Arrays;
import java.util.Scanner;

public class P03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt) // .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 == 0) {
                sum += numbersArr[i];
            }
        }

        System.out.println(sum);

    }
}
