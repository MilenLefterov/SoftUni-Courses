package midExam;

import java.util.Scanner;

public class P01_BurgerBus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfCities = Integer.parseInt(scan.nextLine());

        double totalProfit = 0.0;
        if (numOfCities < 16) {
            for (int i = 1; i <= numOfCities; i++) {
                String cityName = scan.nextLine();
                double income = Double.parseDouble(scan.nextLine());
                double expenses = Double.parseDouble(scan.nextLine());

                double totalProfitForCurrentCity = 0.0;
                if (i % 3 == 0 && i % 5 == 0) {
                    totalProfitForCurrentCity = (income * 0.9) - expenses;
                } else if (i % 3 == 0) {
                    totalProfitForCurrentCity = income - (expenses * 1.5);
                } else if (i % 5 == 0) {
                    totalProfitForCurrentCity = (income * 0.9) - expenses;
                } else {
                    totalProfitForCurrentCity = income - expenses;
                }
                totalProfit += totalProfitForCurrentCity;
                System.out.printf("In %s Burger Bus earned %.2f leva.\n", cityName, totalProfitForCurrentCity);
            }


            System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
        }
    }
}
