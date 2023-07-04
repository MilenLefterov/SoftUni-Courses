package Lectures_Labs.Lecture3;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt) // .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] secondsArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt) // .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;
        int index = -1;
        if (firstArr.length == secondsArr.length) {
            for (int i = 0; i < firstArr.length; i++) {
                if (firstArr[i] == secondsArr[i]) {
                    sum += firstArr[i];
                } else {
                    index = i;
                    break;
                }
            }
        }

        if (index == -1) {
            System.out.printf("Arrays are identical. Sum: %s", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %s index.", index);
        }
    }
}
