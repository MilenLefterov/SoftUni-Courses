package Week1.Exercises;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfPages = Integer.parseInt(scan.nextLine());
        int PagesPerHour = Integer.parseInt(scan.nextLine());
        int numberOfDays = Integer.parseInt(scan.nextLine());
        System.out.println((numberOfPages / PagesPerHour) / numberOfDays);
    }
}
