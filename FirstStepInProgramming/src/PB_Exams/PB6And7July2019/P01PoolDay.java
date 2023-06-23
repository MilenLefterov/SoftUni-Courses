package PB_Exams.PB6And7July2019;

import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());
        double fee = Double.parseDouble(scan.nextLine());
        double priceForASunLounger = Double.parseDouble(scan.nextLine());
        double priceForAnUmbrella = Double.parseDouble(scan.nextLine());

        double sum = (numberOfPeople * fee) +
                (Math.ceil(numberOfPeople * 0.75) * priceForASunLounger) +
                (Math.ceil(numberOfPeople * 0.5) * priceForAnUmbrella);

        System.out.printf("%.2f lv.", sum);
    }
}
