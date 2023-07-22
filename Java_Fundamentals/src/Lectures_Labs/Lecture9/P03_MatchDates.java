package Lectures_Labs.Lecture9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regexForDate = "\\b(?<Day>\\d{2})([.|\\-|\\/])(?<Month>[A-Z][a-z]{2})\\2(?<Year>\\d{4})\\b";
        Pattern pattern = Pattern.compile(regexForDate);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.printf("Day: %s, Month: %s, Year: %s\n",
                    matcher.group("Day"),
                    matcher.group("Month"),
                    matcher.group("Year"));
        }
    }
}
