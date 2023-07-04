package Exercises.Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt) // .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int index = -1;
        for (int i = 0; i < numbersArr.length; i++) {
            int leftSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numbersArr[j];
            }

            int rightSum = 0;
            for (int j = i + 1; j < numbersArr.length; j++) {
                rightSum += numbersArr[j];
            }

            if (leftSum == rightSum) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}
