package Exercises.Exercise1;

import java.util.Scanner;

public class P05_Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName = scan.nextLine();
        String pass = "";

        for (int i = userName.length() - 1; i >= 0; i--) {
            pass += userName.charAt(i);
        }

        String input = scan.nextLine();
        int tries = 1;

        while (!pass.equals(input)) {
            if (tries == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scan.nextLine();
            tries++;
        }

        if (pass.equals(input)) {
            System.out.printf("User %s logged in.", userName);

        }
    }
}
