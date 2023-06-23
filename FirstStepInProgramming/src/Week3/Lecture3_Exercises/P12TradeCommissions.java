package Week3.Lecture3_Exercises;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        double s = Double.parseDouble(scan.nextLine());

        if (city.equals("Sofia")) {
            if (s >= 0 && s <= 500)
                s = s * 0.05;
            else if (s > 500 && s <= 1000)
                s = s * 0.07;
            else if (s > 1000 && s <= 10000)
                s = s * 0.08;
            else if (s > 10000)
                s = s * 0.12;
            else
                System.out.println("error");
            if (s >= 0)
                System.out.printf("%.2f", s);
        } else if (city.equals("Varna")) {
            if (s >= 0 && s <= 500)
                s = s * 0.045;
            else if (s > 500 && s <= 1000)
                s = s * 0.075;
            else if (s > 1000 && s <= 10000)
                s = s * 0.10;
            else if (s > 10000)
                s = s * 0.13;
            else
                System.out.println("error");
            if (s >= 0)
                System.out.printf("%.2f", s);
        } else if (city.equals("Plovdiv")) {
            if (s >= 0 && s <= 500)
                s = s * 0.055;
            else if (s > 500 && s <= 1000)
                s = s * 0.08;
            else if (s > 1000 && s <= 10000)
                s = s * 0.12;
            else if (s > 10000)
                s = s * 0.145;
            else
                System.out.println("error");
            if (s >= 0)
                System.out.printf("%.2f", s);
        } else
            System.out.println("error");


    }
}
