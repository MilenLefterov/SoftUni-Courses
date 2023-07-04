package Exercises.Exercise2;

import java.util.Scanner;

public class P04_SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            char currentCharacter = scan.nextLine().charAt(0);
            sum += currentCharacter;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
