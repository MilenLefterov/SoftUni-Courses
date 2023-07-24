package Exercises.Exercise9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06_ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String emailRegex = "_\\.+([A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(emailRegex);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                StringBuilder group = new StringBuilder();
                for (Character currentChar : matcher.group().toCharArray()) {
                    if (Character.isDigit(currentChar)) {
                        group.append(currentChar);
                    }
                }

                if (group.length() != 0) {
                    System.out.printf("Group: %s\n", group);
                } else {
                    System.out.println("Group: default");
                }

            } else {
                System.out.println("Invalid pass!");
            }
        }
    }
}
