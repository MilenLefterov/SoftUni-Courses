package PB_Exams.PB6And7April2019;

import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int voucher = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        double sum = 0;
        int countTickets = 0;
        int countOther = 0;

        while (!command.equals("End")) {
            if (command.length() > 8) {
                sum += command.charAt(0) + command.charAt(1);

                if (sum <= voucher) {
                    voucher -= sum;
                    sum = 0;
                    countTickets++;
                } else
                    break;
            } else {
                sum += command.charAt(0);

                if (sum <= voucher) {
                    voucher -= sum;
                    sum = 0;
                    countOther++;
                } else
                    break;
            }
            command = scan.nextLine();
        }


        System.out.println(countTickets);
        System.out.println(countOther);

    }
}
