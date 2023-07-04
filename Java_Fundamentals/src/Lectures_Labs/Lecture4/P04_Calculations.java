package Lectures_Labs.Lecture4;

import java.util.Scanner;

public class P04_Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int numFirst = Integer.parseInt(scan.nextLine());
        int numSecond = Integer.parseInt(scan.nextLine());

        switch (command) {
            case "add":
                System.out.println(add(numFirst, numSecond));
                break;
            case "multiply":
                System.out.println(multiply(numFirst, numSecond));
                break;
            case "subtract":
                System.out.println(subtract(numFirst, numSecond));
                break;
            case "divide":
                System.out.println(divide(numFirst, numSecond));
                break;
        }
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public static int subtract(int n1, int n2) {
        return n1 - n2;
    }

    public static int divide(int n1, int n2) {
        return n1 / n2;
    }

}
