package ProgrammingFundamentalsFinalExam.FinalExam_Preparation.E02_ProgrammingFundamentalsFinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([\\/=])(?<name>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> destinationsList = new ArrayList<>();


        int travelPoints = 0;
        while (matcher.find()) {
            destinationsList.add(matcher.group("name"));
            travelPoints += matcher.group("name").length();
        }


        System.out.printf("Destinations: %s\n", String.join(", ", destinationsList));
        System.out.printf("Travel Points: %d\n", travelPoints);

    }
}
