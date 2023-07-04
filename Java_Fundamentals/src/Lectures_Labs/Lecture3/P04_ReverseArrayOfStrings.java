package Lectures_Labs.Lecture3;

import java.util.Scanner;

public class P04_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split(" ");

        for (int i = 0; i < (arr.length / 2); i++) {
            String slab = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = slab;
        }

        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
