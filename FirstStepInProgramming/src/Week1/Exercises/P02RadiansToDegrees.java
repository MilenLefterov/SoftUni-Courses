package Week1.Exercises;

import java.util.Scanner;

public class P02RadiansToDegrees {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double radians = Double.parseDouble(scan.nextLine());
        System.out.println(radians * 180 / Math.PI);
    }
}
