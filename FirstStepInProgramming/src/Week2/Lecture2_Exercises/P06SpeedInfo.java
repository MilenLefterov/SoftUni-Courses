package Week2.Lecture2_Exercises;

import java.util.Scanner;

public class P06SpeedInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());

        if (num <= 10)
            System.out.println("slow");
        else if (num <= 50)
            System.out.println("average");
        else if (num <= 150)
            System.out.println("fast");
        else if (num <= 1000)
            System.out.println("ultra fast");
        else
            System.out.println("extremely fast");

    }
}
