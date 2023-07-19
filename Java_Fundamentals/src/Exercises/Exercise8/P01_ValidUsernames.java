package Exercises.Exercise8;

import java.util.Scanner;

public class P01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userNamesArr = scanner.nextLine().split(", ");
        for (String username : userNamesArr) {
            if (isValid(username)) {
                System.out.println(username);
            }
        }
    }

    public static boolean isValid(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }

        for (Character currentChar : username.toCharArray()) {
            if (!Character.isLetterOrDigit(currentChar) && currentChar != '-' && currentChar != '_') {
                return false;
            }
        }

        return true;
    }
}
