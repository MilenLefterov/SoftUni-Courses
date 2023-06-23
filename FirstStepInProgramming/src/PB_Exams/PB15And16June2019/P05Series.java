package PB_Exams.PB15And16June2019;

import java.util.Scanner;

public class P05Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            String movie = scan.nextLine();
            double price = Double.parseDouble(scan.nextLine());

            switch (movie) {
                case "Thrones":
                    sum += price * 0.5;
                    break;
                case "Lucifer":
                    sum += price * 0.6;
                    break;
                case "Protector":
                    sum += price * 0.7;
                    break;
                case "TotalDrama":
                    sum += price * 0.8;
                    break;
                case "Area":
                    sum += price * 0.9;
                    break;
                default:
                    sum += price;
                    break;

            }
        }

        if (budget >= sum)
            System.out.printf("You bought all the series and left with %.2f lv.", Math.abs(sum - budget));
        else
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(sum - budget));
    }
}
