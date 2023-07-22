package Lectures_Labs.Lecture9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regexForPhoneNumbers = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(regexForPhoneNumbers);
        Matcher matcher = pattern.matcher(text);

        List<String> matchedPhoneNumbers = new ArrayList<>();

        while (matcher.find()) {
            matchedPhoneNumbers.add(matcher.group());
        }
        System.out.println(String.join(", ", matchedPhoneNumbers));
    }
}
