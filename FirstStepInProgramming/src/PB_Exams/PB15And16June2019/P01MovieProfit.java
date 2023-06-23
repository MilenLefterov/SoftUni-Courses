package PB_Exams.PB15And16June2019;

import java.util.Scanner;

public class P01MovieProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        int tickets = Integer.parseInt(scan.nextLine());
        double priceForTicket = Double.parseDouble(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());

        double sum = (tickets * priceForTicket) * days;

        System.out.printf("The profit from the movie %s is %.2f lv.", name, sum - (sum * (percent * 1.0 / 100)));

    }
}
