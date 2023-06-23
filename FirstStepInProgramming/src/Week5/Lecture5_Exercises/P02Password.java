package Week5.Lecture5_Exercises;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName = scan.nextLine();
        String pass = scan.nextLine();
        String inputPass = scan.nextLine();

        while (!inputPass.equals(pass)) {
            inputPass = scan.nextLine();
        }
        System.out.println("Welcome " + userName + "!");
    }
}
