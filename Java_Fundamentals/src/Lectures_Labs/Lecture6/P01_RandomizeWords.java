package Lectures_Labs.Lecture6;

import java.util.Random;
import java.util.Scanner;

public class P01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] wordsArr = scan.nextLine().split(" ");

        for (int i = 0; i < wordsArr.length; i++) {

            int rnd1 = new Random().nextInt(wordsArr.length);
            int rnd2 = new Random().nextInt(wordsArr.length);

            String swap = wordsArr[rnd1];
            wordsArr[rnd1] = wordsArr[rnd2];
            wordsArr[rnd2] = swap;

        }

        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}
