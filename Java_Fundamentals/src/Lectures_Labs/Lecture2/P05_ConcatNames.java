package Lectures_Labs.Lecture2;

import java.util.Scanner;

public class P05_ConcatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        String delimiter = scan.nextLine();

        String result = String.format("%s%s%s", name1, delimiter, name2);

        System.out.println(result);
    }
}
