package Week1.Lecture1_Exercises;

import java.util.Scanner;

public class P07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int hour = Integer.parseInt(scan.nextLine());
        int time = hour * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                name, time, hour);
    }
}
