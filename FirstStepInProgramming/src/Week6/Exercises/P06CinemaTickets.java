package Week6.Exercises;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int totalTickets = 0;
        double students = 0;
        double standard = 0;
        double kids = 0;

        while (!input.equals("Finish")) {
            int capacity = Integer.parseInt(scan.nextLine());
            String ticket = scan.nextLine();
            double occupiedSeats = 0;
            while (!ticket.equals("End")) {
                switch (ticket) {
                    case "student":
                        students++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kids++;
                        break;
                }
                totalTickets++;
                occupiedSeats++;
                if (capacity > occupiedSeats)
                    ticket = scan.nextLine();
                else
                    break;
            }
            System.out.printf("%s - %.2f%% full.\n", input, (occupiedSeats * 100 / capacity));
            input = scan.nextLine();
        }

        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", (students * 100 / totalTickets));
        System.out.printf("%.2f%% standard tickets.\n", (standard * 100 / totalTickets));
        System.out.printf("%.2f%% kids tickets.", (kids * 100 / totalTickets));

    }
}
