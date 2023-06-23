package PB_Exams.PB6And7July2019;

import java.util.Scanner;

public class P03TravelAgency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();
        String packageType = scan.nextLine();
        String VIP = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());

        double sum = 0;

        if (days > 7)
            days -= 1;

        if (days < 1)
            System.out.println("Days must be positive number!");
        else {
            switch (town) {
                case "Bansko":
                case "Borovets":
                    if (packageType.equals("withEquipment")) {
                        sum += days * 100;
                        if (VIP.equals("yes"))
                            sum *= 0.9;
                    } else if (packageType.equals("noEquipment")) {
                        sum += days * 80;
                        if (VIP.equals("yes"))
                            sum *= 0.95;
                    }
                    else
                        System.out.println("Invalid input!");
                    break;

                case "Varna":
                case "Burgas":
                    if (packageType.equals("withBreakfast")) {
                        sum += days * 130;
                        if (VIP.equals("yes"))
                            sum *= 0.88;
                    } else if (packageType.equals("noBreakfast")) {
                        sum += days * 100;
                        if (VIP.equals("yes"))
                            sum *= 0.93;
                    } else
                        System.out.println("Invalid input!");
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
            if (sum > 0)
                System.out.printf("The price is %.2flv! Have a nice time!", sum);
        }
    }
}
