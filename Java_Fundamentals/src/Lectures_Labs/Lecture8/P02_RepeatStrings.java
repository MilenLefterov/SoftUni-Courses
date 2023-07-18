package Lectures_Labs.Lecture8;

import java.util.Scanner;

public class P02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputWordsArr = scanner.nextLine().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputWordsArr.length; i++) {
            for (int j = 0; j < inputWordsArr[i].length(); j++) {
                result.append(inputWordsArr[i]);
            }
        }

        System.out.println(result);

    }
}
