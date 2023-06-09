package Exercises.Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class P05_TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt) // .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < numbersArr.length; i++) {
            boolean isTopInteger = true;
            for (int j = i + 1; j < numbersArr.length; j++) {
                if (numbersArr[i] <= numbersArr[j]) {
                    isTopInteger = false;
                    break;
                }
            }
            if (isTopInteger) {
                System.out.print(numbersArr[i] + " ");
            }
        }
    }
}
