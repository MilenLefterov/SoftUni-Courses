package Exercises.Exercise2;

import java.util.Scanner;

public class P05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int stop = Integer.parseInt(scan.nextLine());

        for (int i = start; i <= stop; i++) {
            System.out.printf("%c ", i);
        }
    }
}
