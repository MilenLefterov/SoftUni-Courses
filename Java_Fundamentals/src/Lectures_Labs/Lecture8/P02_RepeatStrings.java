package Lectures_Labs.Lecture8;

import java.util.Scanner;

public class P02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputWordsArr = scanner.nextLine().split("\\s+");

        StringBuilder result = new StringBuilder();


        for (String word : inputWordsArr) {
            result.append(word.repeat(word.length()));
        }

        System.out.println(result);

    }
}
