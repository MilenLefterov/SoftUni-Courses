package Lectures_Labs.Lecture8;

import java.util.Scanner;

public class P01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputWord = scanner.nextLine();
        while (!inputWord.equals("end")) {
            System.out.print(inputWord + " = ");
            for (int i = inputWord.length() - 1; i >= 0; i--) {
                System.out.print(inputWord.charAt(i));
            }
            System.out.println("");
            inputWord = scanner.nextLine();
        }

    }
}
