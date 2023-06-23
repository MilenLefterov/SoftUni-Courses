package Week3.Exercises;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scan.nextLine());
        int minuteOfExam = Integer.parseInt(scan.nextLine());
        int hourOfArrival = Integer.parseInt(scan.nextLine());
        int minuteOfArrival = Integer.parseInt(scan.nextLine());

        int examTime = hourOfExam * 60 + minuteOfExam;
        int arrivalTime = hourOfArrival * 60 + minuteOfArrival;

        int difference = examTime - arrivalTime;

        int differenceInHour = Math.abs(difference / 60);
        int differenceInMin = Math.abs(difference % 60);

        if (difference < 0) {
            System.out.println("Late");
            if (differenceInHour > 0)
                if (differenceInMin < 10)
                    System.out.printf("%d:0%d hours after the start", differenceInHour, differenceInMin);
                else
                    System.out.printf("%d:%d hours after the start", differenceInHour, differenceInMin);
            else
                System.out.printf("%d minutes after the start", differenceInMin);
        } else if (difference <= 30) {
            System.out.println("On time");
            if (differenceInMin > 0)
                System.out.printf("%d minutes before the start", differenceInMin);
        } else {
            System.out.println("Early");
            if (differenceInHour > 0)
                if (differenceInMin < 10)
                    System.out.printf("%d:0%d hours before the start", differenceInHour, differenceInMin);
                else
                    System.out.printf("%d:%d hours before the start", differenceInHour, differenceInMin);
            else
                System.out.printf("%d minutes before the start", differenceInMin);
        }
    }
}
