package Week3.Exercises;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int daysToStay = Integer.parseInt(scan.nextLine());
        String room = scan.nextLine();
        String assessment = scan.nextLine();

        double sum = 0;

        switch (room) {
            case "room for one person":
                sum = (daysToStay - 1) * 18;
                break;
            case "apartment":
                if (daysToStay < 10)
                    sum = ((daysToStay - 1) * 25) * 0.7;
                else if (daysToStay <= 15)
                    sum = ((daysToStay - 1) * 25) * 0.65;
                else
                    sum = ((daysToStay - 1) * 25) * 0.5;
                break;
            case "president apartment":
                if (daysToStay < 10)
                    sum = ((daysToStay - 1) * 35) * 0.9;
                else if (daysToStay <= 15)
                    sum = ((daysToStay - 1) * 35) * 0.85;
                else
                    sum = ((daysToStay - 1) * 35) * 0.80;
                break;
        }

        if(assessment.equals("positive"))
            sum = sum * 1.25;
        else
            sum = sum * 0.9;

        System.out.printf("%.2f", sum);
    }
}
