package Week2.Lecture2_Exercises;

import java.util.Scanner;

public class P04PasswordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pass = "s3cr3t!P@ssw0rd";

        String inputPass = scan.nextLine();

        if (inputPass.equals(pass))
            System.out.println("Welcome");
        else
            System.out.println("Wrong password!");
    }
}
