package Lectures_Labs.Lecture4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        String first = scan.nextLine();
        String second = scan.nextLine();
        switch (type) {
            case "int":
                printResult(
                        Integer.toString(
                                getMax(Integer.parseInt(first), Integer.parseInt(second))
                        ));
                break;

            case "char":
                printResult(
                        getMax(first.charAt(0), second.charAt(0)) + ""
                );
                break;

            case "string":
                printResult(getMax(first, second));
                break;
        }
    }

    public static int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else
            return second;
    }

    public static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        } else
            return second;
    }

    public static char getMax(char first, char second) {
        if (first > second) {
            return first;
        } else
            return second;
    }

    public static void printResult(String text) {
        System.out.println(text);
    }
}
