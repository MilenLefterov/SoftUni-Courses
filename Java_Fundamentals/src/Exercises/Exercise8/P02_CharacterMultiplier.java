package Exercises.Exercise8;

import java.util.Scanner;

public class P02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");

        System.out.println(totalSum(text[0], text[1]));

    }

    public static int totalSum(String str1, String str2) {
        int result = 0;

        if (str1.length() == str2.length()) {
            result += multiplicationOfElements(str1, str2);
        } else if (str1.length() > str2.length()) {
            result += multiplicationOfElements(str1, str2);
            result += remainingElements(str1, str2);
        } else {
            result += multiplicationOfElements(str2, str1);
            result += remainingElements(str2, str1);
        }

        return result;
    }

    public static int multiplicationOfElements(String longStr, String shortStr) {
        int sum = 0;
        for (int i = 0; i < shortStr.length(); i++) {
            sum += (int) shortStr.charAt(i) * (int) longStr.charAt(i);
        }
        return sum;
    }

    public static int remainingElements(String firstStr, String secondStr) {
        int sum = 0;
        for (int i = firstStr.length() - 1; i > secondStr.length() - 1; i--) {
            sum += (int) firstStr.charAt(i);
        }
        return sum;
    }
}
