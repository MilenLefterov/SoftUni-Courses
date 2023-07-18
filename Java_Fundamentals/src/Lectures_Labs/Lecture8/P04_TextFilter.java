package Lectures_Labs.Lecture8;

import java.util.Scanner;

public class P04_TextFilter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : banWordsArr) {
            String symbol = "*";
            text = text.replaceAll(banWord, symbol.repeat(banWord.length()));
        }

        System.out.println(text);

    }
}
