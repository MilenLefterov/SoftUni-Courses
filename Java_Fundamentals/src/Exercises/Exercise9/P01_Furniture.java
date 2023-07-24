package Exercises.Exercise9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<itemName>[A-z]+)<<(?<itemPrice>\\d+\\.?\\d*)!(?<itemQuantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> itemsList = new ArrayList<>();

        String input = scanner.nextLine();
        double totalPrice = 0.00;
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                itemsList.add(matcher.group("itemName"));
                totalPrice += Double.parseDouble(matcher.group("itemPrice")) *
                        Double.parseDouble(matcher.group("itemQuantity"));
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String f : itemsList) {
            System.out.println(f);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
