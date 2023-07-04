package Exercises.Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class P04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt) // .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int numberRotations = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberRotations; i++) {
            int firstNumberFromArr = numbersArr[0];
            for (int j = 1; j < numbersArr.length; j++) {
                numbersArr[j - 1] = numbersArr[j];
            }
            numbersArr[numbersArr.length - 1] = firstNumberFromArr;
        }

        for (int el : numbersArr) {
            System.out.print(el + " ");
        }
    }
}
