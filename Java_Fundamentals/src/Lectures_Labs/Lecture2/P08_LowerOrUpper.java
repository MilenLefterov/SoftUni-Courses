package Lectures_Labs.Lecture2;

import java.util.Scanner;

public class P08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char character = scan.nextLine().charAt(0);

        if (Character.isLowerCase(character)) {
            System.out.println("lower-case");
        } else if (Character.isUpperCase(character)) {
            System.out.println("upper-case");
        }
    }
}
