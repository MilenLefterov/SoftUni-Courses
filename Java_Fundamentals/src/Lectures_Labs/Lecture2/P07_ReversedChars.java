package Lectures_Labs.Lecture2;

import java.util.Scanner;

public class P07_ReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char firstCharacter = scan.nextLine().charAt(0);
        char secondCharacter = scan.nextLine().charAt(0);
        char thirdCharacter = scan.nextLine().charAt(0);

        String result = String.format("%c %c %c", thirdCharacter, secondCharacter, firstCharacter);
        System.out.println(result);
    }
}
