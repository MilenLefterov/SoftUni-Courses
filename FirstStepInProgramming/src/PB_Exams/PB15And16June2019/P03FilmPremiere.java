package PB_Exams.PB15And16June2019;

import java.util.Scanner;

public class P03FilmPremiere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movie = scan.nextLine();
        String packet = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());

        double sum = 0;
        switch (movie) {
            case "John Wick":
                if (packet.equals("Drink")) {
                    sum += 12;
                } else if (packet.equals("Popcorn")) {
                    sum += 15;
                } else {
                    sum += 19;
                }
                break;
            case "Star Wars":
                if (packet.equals("Drink")) {
                    sum += 18;
                } else if (packet.equals("Popcorn")) {
                    sum += 25;
                } else {
                    sum += 30;
                }
                if(tickets >= 4)
                    sum *= 0.70;
                break;
            case "Jumanji":
                if (packet.equals("Drink")) {
                    sum += 9;
                } else if (packet.equals("Popcorn")) {
                    sum += 11;
                } else {
                    sum += 14;
                }
                if(tickets == 2)
                    sum *= 0.85;
                break;
        }
        System.out.printf("Your bill is %.2f leva.", sum * tickets);
    }
}
