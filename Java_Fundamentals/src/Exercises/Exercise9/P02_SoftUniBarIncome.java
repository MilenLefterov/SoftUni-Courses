package Exercises.Exercise9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<customerName>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quantity>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        double totalPrice = 0.00;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                double currentTotal = Double.parseDouble(matcher.group("quantity")) * Double.parseDouble(matcher.group("price"));
                System.out.printf("%s: %s - %.2f\n",
                        matcher.group("customerName"),
                        matcher.group("product"),
                        currentTotal);

                totalPrice += currentTotal;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalPrice);
    }
}
