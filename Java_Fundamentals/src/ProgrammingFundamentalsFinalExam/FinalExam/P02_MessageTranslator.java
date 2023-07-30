package ProgrammingFundamentalsFinalExam.FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regexBarcode = "([\\!])(?<command>[A-Z][a-z]+)\\1:\\[(?<word>[A-Za-z]{8,})\\]";
        Pattern patterBarcode = Pattern.compile(regexBarcode);

        for (int i = 0; i < n; i++) {
            Matcher matcher = patterBarcode.matcher(scanner.nextLine());
            if (matcher.find()) {
                String command = matcher.group("command");
                String word = matcher.group("word");

                StringBuilder result = new StringBuilder();
                for (Character currentChar : word.toCharArray()) {
                    result.append(" " + (int) currentChar);
                }
                System.out.printf("%s:%s\n", command, result);

            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}
