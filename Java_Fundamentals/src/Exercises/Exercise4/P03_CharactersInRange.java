package Exercises.Exercise4;

import java.util.Scanner;

public class P03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char characterOne = scan.nextLine().charAt(0);
        char characterTwo = scan.nextLine().charAt(0);

        printsAllTheCharacters(characterOne, characterTwo);
    }

    public static void printsAllTheCharacters(char characterOne, char characterTwo) {

        if (characterOne < characterTwo) {
            printCharacters(characterOne, characterTwo);
        } else {
            printCharacters(characterTwo, characterOne);
        }
    }

    public static void printCharacters(int startSymbol, int endSymbol) {
        for (int ch = startSymbol + 1; ch < endSymbol; ch++) {
            System.out.print((char) ch + " ");
        }
    }
}
