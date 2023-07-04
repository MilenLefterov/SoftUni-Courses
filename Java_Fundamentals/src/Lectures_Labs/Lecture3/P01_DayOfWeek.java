package Lectures_Labs.Lecture3;

import java.util.Scanner;

public class P01_DayOfWeek {
    public static void main(String[] args) {
        String dayArr[] = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        if (input >= 1 && input <= dayArr.length) {
            System.out.println(dayArr[input - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
