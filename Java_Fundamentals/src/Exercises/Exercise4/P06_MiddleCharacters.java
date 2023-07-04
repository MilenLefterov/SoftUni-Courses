package Exercises.Exercise4;

import java.util.Scanner;

public class P06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();

        System.out.println(getMiddleCharacter(inputText));
    }

    public static String getMiddleCharacter(String text) {
        int middleTextLength = text.length();
        if (middleTextLength % 2 == 0) {
            return text.charAt(middleTextLength / 2 - 1) + "" + text.charAt(middleTextLength / 2) + "";
        } else {
            return text.charAt(middleTextLength / 2) + "";
        }
    }
}
