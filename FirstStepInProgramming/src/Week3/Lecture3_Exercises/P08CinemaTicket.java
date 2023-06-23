package Week3.Lecture3_Exercises;

import java.util.Scanner;

public class P08CinemaTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
                System.out.println("12");
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println("14");
                break;
            case "Friday":
                System.out.println("12");
                break;
            case "Saturday":
            case "Sunday":
                    System.out.println("16");
                break;
        }
    }
}
