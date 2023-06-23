package Week3.Exercises;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String mount = scan.nextLine();
        int numberOfNights = Integer.parseInt(scan.nextLine());

        switch (mount) {
            case "May":
            case "October":
                if (numberOfNights > 14)
                    System.out.printf("Apartment: %.2f lv.\n", (numberOfNights * 65) * 0.90);
                else
                    System.out.printf("Apartment: %.2f lv.\n", numberOfNights * 1.0 * 65);

                if (numberOfNights > 7 && numberOfNights < 14)
                    System.out.printf("Studio: %.2f lv.", (numberOfNights * 1.0 * 50) * 0.95);
                else if (numberOfNights > 14)
                    System.out.printf("Studio: %.2f lv.", (numberOfNights * 1.0 * 50) * 0.70);
                else
                    System.out.printf("Studio: %.2f lv.", numberOfNights * 1.0 * 50);
                break;
            case "June":
            case "September":
                if (numberOfNights > 14)
                    System.out.printf("Apartment: %.2f lv.\n", (numberOfNights * 68.70) * 0.90);
                else
                    System.out.printf("Apartment: %.2f lv.\n", numberOfNights * 68.70);

                if (numberOfNights > 14)
                    System.out.printf("Studio: %.2f lv.", (numberOfNights * 75.20) * 0.80);
                else
                    System.out.printf("Studio: %.2f lv.", numberOfNights * 75.20);
                break;
            case "July":
            case "August":
                if (numberOfNights > 14)
                    System.out.printf("Apartment: %.2f lv.\n", (numberOfNights * 77) * 0.90);
                else
                    System.out.printf("Apartment: %.2f lv.\n", numberOfNights * 1.0 * 77);

                System.out.printf("Studio: %.2f lv.", numberOfNights * 1.0 * 76);
                break;

        }
    }
}
