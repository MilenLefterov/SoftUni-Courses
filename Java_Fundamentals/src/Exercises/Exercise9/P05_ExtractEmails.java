package Exercises.Exercise9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05_ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();

        String emailRegex = "(?<user>\\w+[\\.\\-]?\\w+)@(?<host>\\w*\\-?\\w*(\\.\\w+)+)";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(inputData);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
