package Lectures_Labs.Lecture4;

import java.util.Scanner;

public class P07_RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int repeatCountN = Integer.parseInt(scan.nextLine());

        printResult(getRepeatedString(text, repeatCountN));
    }

    public static String getRepeatedString(String name, int end) {
        String result = "";
        for (int i = 0; i < end; i++) {
            result += name;
        }
        return result;
    }

    public static void printResult(String result) {
        System.out.println(result);
    }
}
