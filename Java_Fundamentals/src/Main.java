
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCities = Integer.parseInt(scanner.nextLine());

        double totalProfit = 0;
        int specialEventCounter = 0;

        for (int i = 1; i <= numCities; i++) {
            String cityName = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());
            double profit = income - expenses;

            if (i % 3 == 0) {
                specialEventCounter++;
                profit -= expenses * 0.5;
            }

            if (i % 5 == 0) {
                profit -= income * 0.1;
            }

            totalProfit += profit;

            System.out.printf("In %s, Burger Bus earned %.2f leva.%n", cityName, profit);
        }

        System.out.printf("Burger Bus total profit: %.2f leva.%n", totalProfit);
    }
}
