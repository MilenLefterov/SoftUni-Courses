package Lectures_Labs.Lecture8;

import java.util.Scanner;

public class P05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);

            if (Character.isDigit(currentSymbol)) {
                digits.append(currentSymbol);
            } else if (Character.isLetter(currentSymbol)) {
                letters.append(currentSymbol);
            } else {
                other.append(currentSymbol);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);

    }
}
