package Exercises.Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class P08_MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt) // .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int targetSum = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numbersArr.length; i++) {

            for (int j = i + 1; j < numbersArr.length; j++) {
                if (numbersArr[i] + numbersArr[j] == targetSum) {
                    System.out.println(numbersArr[i] + " " + numbersArr[j]);
                }
            }
        }
    }
}
