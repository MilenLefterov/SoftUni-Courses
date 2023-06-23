package Week1.Lecture1_Exercises;

import java.util.Scanner;

public class P05GreetingbyName {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
