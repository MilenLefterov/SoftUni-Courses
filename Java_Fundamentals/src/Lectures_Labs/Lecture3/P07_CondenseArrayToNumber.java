package Lectures_Labs.Lecture3;

import java.util.Arrays;
import java.util.Scanner;

public class P07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt) // .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        while (numbersArr.length > 1) {
            int[] condensedArr = new int[numbersArr.length - 1];
            for (int i = 0; i < numbersArr.length; i++) {
                if (i < numbersArr.length - 1) {
                    condensedArr[i] = numbersArr[i] + numbersArr[i + 1];
                } else {
                    numbersArr = condensedArr;
                }
            }
        }

        System.out.println(numbersArr[0]);
    }
}
