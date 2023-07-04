package Exercises.Exercise2;

import java.util.Scanner;

public class P06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stop = Integer.parseInt(scan.nextLine());

        int startSymbol = 97; // 'a'
        for (int i = startSymbol; i < stop + startSymbol; i++) {
            for (int j = startSymbol; j < stop + startSymbol; j++) {
                for (int k = startSymbol; k < stop + startSymbol; k++) {
                    System.out.printf("%c%c%c\n", i, j, k);
                }
            }
        }
    }
}
