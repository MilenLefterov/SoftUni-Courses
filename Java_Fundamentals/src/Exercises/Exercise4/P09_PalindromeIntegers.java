package Exercises.Exercise4;

import java.util.Scanner;

public class P09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = "";
        input = scan.nextLine();
        while (!input.equals("END")) {
            isItAPalindrome(input);
            input = scan.nextLine();
        }
    }

    public static void isItAPalindrome(String text) {
        boolean isPalindrome = true;

        int textLength = text.length();
        for (int i = 0; i < textLength / 2; i++) {
            if (text.charAt(i) != text.charAt(textLength - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
