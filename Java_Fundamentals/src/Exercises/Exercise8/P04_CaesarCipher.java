package Exercises.Exercise8;

import java.util.Scanner;

public class P04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (Character currentChar : text.toCharArray()) {
            System.out.print((char) (currentChar + 3));

        }
    }
}
