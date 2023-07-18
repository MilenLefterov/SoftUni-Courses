package Lectures_Labs.Lecture8;

import java.util.Scanner;

public class P03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strToRemove = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(strToRemove)) {
            text = text.replaceAll(strToRemove, "");
        }

        System.out.println(text);

    }
}
