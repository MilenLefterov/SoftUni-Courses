package PB_Exams.PB6And7April2019;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int totalTickets = 0;
        double countStudent = 0;
        double countStandard = 0;
        double countKid = 0;

        while (!command.equals("Finish")) {
            int freeSeats = Integer.parseInt(scan.nextLine());
            String type = scan.nextLine();
            double occupiedSeats = 0;

            while (!type.equals("End")) {

                if (type.equals("student")) {
                    countStudent++;
                } else if (type.equals("standard")) {
                    countStandard++;
                } else {
                    countKid++;
                }
                totalTickets++;
                occupiedSeats++;
                if (freeSeats > occupiedSeats)
                    type = scan.nextLine();
                else
                    break;
            }
            System.out.printf("%s - %.2f%% full.\n", command, (occupiedSeats * 100) / freeSeats);

            command = scan.nextLine();
        }

        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", (countStudent * 100) / totalTickets);
        System.out.printf("%.2f%% standard tickets.\n", (countStandard * 100) / totalTickets);
        System.out.printf("%.2f%% kids tickets.", (countKid * 100) / totalTickets);

    }
}
