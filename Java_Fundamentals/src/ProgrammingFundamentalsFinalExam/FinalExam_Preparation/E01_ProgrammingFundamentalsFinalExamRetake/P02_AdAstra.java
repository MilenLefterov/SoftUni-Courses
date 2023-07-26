package ProgrammingFundamentalsFinalExam.FinalExam_Preparation.E01_ProgrammingFundamentalsFinalExamRetake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caloriesPerDay = 2000;

        String text = scanner.nextLine();

        String regex = "(#|\\|)(?<name>[A-Za-z ]+)\\1(?<Data>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[\\d]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> items = new ArrayList<>();
        List<String> dates = new ArrayList<>();
        List<String> calories = new ArrayList<>();

        int totalCalories = 0;
        while (matcher.find()) {
            totalCalories += Integer.parseInt(matcher.group("calories"));
            items.add(matcher.group("name"));
            dates.add(matcher.group("Data"));
            calories.add(matcher.group("calories"));
        }

        int totalDays = totalCalories / caloriesPerDay;
        System.out.printf("You have food to last you for: %d days!\n", totalDays);
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s\n",
                    items.get(i),
                    dates.get(i),
                    calories.get(i));
        }
    }
}
