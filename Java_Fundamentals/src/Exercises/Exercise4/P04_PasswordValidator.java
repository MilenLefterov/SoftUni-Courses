package Exercises.Exercise4;

import java.util.Scanner;

public class P04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pass = scan.nextLine();

        checkPassword(pass);
    }

    public static void checkPassword(String pass) {
        boolean isValidLength = isValidLength(pass);
        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidContent = isValidContent(pass);
        if (!isValidContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isValidCount = isValidCountDigits(pass);
        if (!isValidCount) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidLength && isValidContent && isValidCount) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidLength(String pass) {
        return pass.length() >= 6 && pass.length() <= 10;
    }

    public static boolean isValidContent(String pass) {
        pass = pass.toLowerCase();
        for (int i = 0; i < pass.toLowerCase().length(); i++) {
            int currentCharASCII = pass.charAt(i);
            if ((currentCharASCII < 97 || currentCharASCII > 122) && (currentCharASCII < 48 || currentCharASCII > 57)) {//Character.isLetterOrDigit(symbol)
                return false;
            }
        }
        return true;
    }

    public static boolean isValidCountDigits(String password) {
        int countDigits = 0;
        for (char symbol : password.toCharArray()) {
            if (symbol >= 48 && symbol <= 57) {// Character.isDigit(symbol)
                countDigits++;
            }
        }
        return countDigits >= 2;
    }

}