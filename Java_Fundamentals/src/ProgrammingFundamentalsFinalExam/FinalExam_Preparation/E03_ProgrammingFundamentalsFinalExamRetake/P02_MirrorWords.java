package ProgrammingFundamentalsFinalExam.FinalExam_Preparation.E03_ProgrammingFundamentalsFinalExamRetake;

import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([#]?[@]?)(?<wordOne>[A-Za-z]{3,})\\1{2}(?<wordTwo>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> words = new ArrayList<>();

        boolean faind = false;
        int count = 0;
        while (matcher.find()) {
            faind = true;
            count++;
            StringBuilder wordOneSB = new StringBuilder(matcher.group("wordOne"));
            StringBuilder wordTwoSB = new StringBuilder(matcher.group("wordTwo"));

            if (wordOneSB.length() == wordTwoSB.length()) {
                if (isValidWord(wordOneSB.toString(), wordTwoSB.reverse().toString())) {
                    words.add(wordOneSB.toString());
                    words.add(wordTwoSB.reverse().toString());
                }
            }
        }
        if (!faind) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!\n", count);
        }

        if (words.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            List<String> result = new ArrayList<>();

            for (int i = 0; i < words.size(); i += 2) {
                result.add(words.get(i) + " <=> " + words.get(i + 1));
            }
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", result));
        }
    }

    public static boolean isValidWord(String w1, String w2) {
        boolean isValid = false;
        for (int i = 0; i < w1.length(); i++) {
            if (w1.charAt(i) == w2.charAt(i)) {
                isValid = true;
            } else {
                return false;
            }
        }
        if (isValid) {
            return true;
        }
        return false;
    }
}
