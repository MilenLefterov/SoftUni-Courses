package Week1.Lecture1_Exercises;

import java.util.Scanner;

public class P04InchestoCentimeters {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double inch = Double.parseDouble(scan.nextLine());
        System.out.println(inch * 2.54);
    }
}
