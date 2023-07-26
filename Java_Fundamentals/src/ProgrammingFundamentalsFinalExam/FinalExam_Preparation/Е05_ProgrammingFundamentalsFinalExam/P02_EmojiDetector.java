package ProgrammingFundamentalsFinalExam.FinalExam_Preparation.Е05_ProgrammingFundamentalsFinalExam;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String numberRegex = "(?<num>[0-9])";
        Pattern numberPattern = Pattern.compile(numberRegex);
        Matcher numberMatcher = numberPattern.matcher(text);

        String emojiRegex = "(\\:\\:|\\*\\*)(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern emojiPattern = Pattern.compile(emojiRegex);
        Matcher emojiMatcher = emojiPattern.matcher(text);

        BigInteger coolThreshold = new BigInteger("1");
        while (numberMatcher.find()) {
            BigInteger number = new BigInteger(numberMatcher.group("num"));

            coolThreshold = coolThreshold.multiply(number);
        }

        int count = 0;
        List<String> collEmojiList = new ArrayList<>();

        while (emojiMatcher.find()) {
            count++;
            BigInteger sum = new BigInteger("0");
            for (Character currentChar : emojiMatcher.group("emoji").toCharArray()) {
                int ascii = currentChar;
                BigInteger currentAscii = new BigInteger(ascii + "");
                sum = sum.add(currentAscii);
            }
            if (sum.compareTo(coolThreshold) > 0) {
                collEmojiList.add(emojiMatcher.group());
            }
        }

        System.out.printf("Cool threshold: %d\n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:\n", count);
        collEmojiList.forEach(System.out::println);
    }
}
