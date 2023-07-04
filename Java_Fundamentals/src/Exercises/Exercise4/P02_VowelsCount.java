package Exercises.Exercise4;

import java.util.Scanner;

public class P02_VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                getTheNumberOfVowels(
                        scan.nextLine()
                )
        );
    }

    public static int getTheNumberOfVowels(String text) {
        int count = 0;
        for (char ch : text.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

}
