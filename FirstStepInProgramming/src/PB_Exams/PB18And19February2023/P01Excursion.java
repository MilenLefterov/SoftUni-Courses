package PB_Exams.PB18And19February2023;

import java.util.Scanner;

public class P01Excursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int overnightStay = 20;
        double transportCard = 1.6;
        int ticket = 6;

        int numberOfPeople = Integer.parseInt(scan.nextLine());
        int numberOfOvernightStay = Integer.parseInt(scan.nextLine());
        int numberOfTransportCard = Integer.parseInt(scan.nextLine());
        int numberOfTickets = Integer.parseInt(scan.nextLine());

        double sum = ((numberOfOvernightStay * overnightStay) +
                (numberOfTransportCard * transportCard) +
                (numberOfTickets * ticket)) * numberOfPeople;

        sum *= 1.25;

        System.out.printf("%.2f", sum);

    }
}
