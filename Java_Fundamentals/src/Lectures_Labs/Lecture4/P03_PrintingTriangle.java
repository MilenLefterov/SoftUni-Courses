package Lectures_Labs.Lecture4;

import java.util.Scanner;

public class P03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        printTriangle(n);
    }

    public static void printTriangle(int length) {
        int startNum = 1;
        for (int i = 0; i <= length; i++) {
            printLine(startNum, i);
        }

        for (int i = length - 1; i > 0; i--) {
            printLine(startNum, i);
        }
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
