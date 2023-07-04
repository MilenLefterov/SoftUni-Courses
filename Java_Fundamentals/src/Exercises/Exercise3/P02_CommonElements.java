package Exercises.Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstArr = scan.nextLine().split(" ");
        String[] secondArr = scan.nextLine().split(" ");

        for (int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < firstArr.length; j++) {
                if (secondArr[i].equals(firstArr[j])) {
                    System.out.print(secondArr[i] + " ");
                }
            }
        }

    }
}
