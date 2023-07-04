package Exercises.Exercise3;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class P07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt) // .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int numberOfRepetitions = -1;
        int repeatingSymbolIndex = -1;
        for (int i = 0; i < numbersArr.length; i++) {

            int currentRepeatingSymbol = 0;
            for (int j = i + 1; j < numbersArr.length; j++) {
                if (numbersArr[i] == numbersArr[j]) {
                    currentRepeatingSymbol++;
                } else {
                    break;
                }
            }
            if (numberOfRepetitions < currentRepeatingSymbol) {
                repeatingSymbolIndex = i;
                numberOfRepetitions = currentRepeatingSymbol;
            }
        }

        for (int i = repeatingSymbolIndex; i < numberOfRepetitions + repeatingSymbolIndex + 1; i++) {
            System.out.print(numbersArr[i] + " ");
        }
    }
}
