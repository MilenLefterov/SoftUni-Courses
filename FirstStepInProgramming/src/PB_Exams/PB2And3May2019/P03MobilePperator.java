package PB_Exams.PB2And3May2019;

import java.util.Scanner;

public class P03MobilePperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String year = scan.nextLine();
        String contract = scan.nextLine();
        String internet = scan.nextLine();
        int mounts = Integer.parseInt(scan.nextLine());

        double fee = 0;

        switch (contract) {
            case "Small":
                if (year.equals("one")) {
                    fee = 9.98;
                } else {
                    fee = 8.58;
                }
                break;
            case "Middle":
                if (year.equals("one")) {
                    fee = 18.99;
                } else {
                    fee = 17.09;
                }
                break;
            case "Large":
                if (year.equals("one")) {
                    fee = 25.98;
                } else {
                    fee = 23.59;
                }
                break;
            case "ExtraLarge":
                if (year.equals("one")) {
                    fee = 35.99;
                } else {
                    fee = 31.79;
                }
                break;
        }
        if (internet.equals("yes")) {
            if (fee <= 10) {
                fee += 5.50;
            } else if (fee <= 30) {
                fee += 4.35;
            } else {
                fee += 3.85;
            }
        }

        if (year.equals("two")) {
            fee = fee - (fee * 0.0375) ;
        }

        System.out.printf("%.2f lv.", fee * mounts);
    }
}
