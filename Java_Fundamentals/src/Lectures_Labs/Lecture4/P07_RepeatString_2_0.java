package Lectures_Labs.Lecture4;

import java.util.Scanner;

public class P07_RepeatString_2_0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int repeatCountN = Integer.parseInt(scan.nextLine());

        printResult(getRepeatedString(text, repeatCountN));
    }

    public static String getRepeatedString(String name, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < end; i++) {
            result.append(name);
        }
        return result.toString();
    }

    public static void printResult(String result) {
        System.out.println(result);
    }
}
