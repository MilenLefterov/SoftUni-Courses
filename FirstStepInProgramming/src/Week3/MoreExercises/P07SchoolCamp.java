package Week3.MoreExercises;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        String group = scan.nextLine();
        int students = Integer.parseInt(scan.nextLine());
        int overnightStays = Integer.parseInt(scan.nextLine());

        double sum = 0;
        String sport = "";

        switch (season) {
            case "Winter":
                if (group.equals("boys")) {
                    sum = overnightStays * students * 9.60;
                    sport = "Judo";
                } else if (group.equals("girls")) {
                    sum = overnightStays * students * 9.60;
                    sport = "Gymnastics";
                } else {
                    sum = overnightStays * students * 10;
                    sport = "Ski";
                }
                break;
            case "Spring":
                if (group.equals("boys")) {
                    sum = overnightStays * students * 7.20;
                    sport = "Tennis";
                } else if (group.equals("girls")) {
                    sum = overnightStays * students * 7.20;
                    sport = "Athletics";
                } else {
                    sum = overnightStays * students * 9.50;
                    sport = "Cycling";
                }
                break;
            case "Summer":
                if (group.equals("boys")) {
                    sum = overnightStays * students * 15;
                    sport = "Football";
                } else if (group.equals("girls")) {
                    sum = overnightStays * students * 15;
                    sport = "Volleyball";
                } else {
                    sum = overnightStays * students * 20;
                    sport = "Swimming";
                }
                break;
        }

        if (students >= 50)
            sum *= 0.50;
        else if (students >= 20)
            sum *= 0.85;
        else if(students >= 10)
            sum *= 0.95;

        System.out.printf("%s %.2f lv.",sport, sum);

    }
}
