package PB_Exams.PB18And19February2023;

import java.util.Scanner;

public class P04Workout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int target = 1000;

        int days = Integer.parseInt(scan.nextLine());
        double km = Double.parseDouble(scan.nextLine());

        double sum = 0;

        for (int i = 0; i <= days; i++) {

            if (i != 0) {
                int percent = Integer.parseInt(scan.nextLine());
                km += km * ((percent * 1.0) / 100);
            }
            sum += km;
        }

        double difference = Math.ceil( Math.abs(sum - target));

        if (sum > target) {
            System.out.printf("You've done a great job running %.0f more kilometers!", difference);
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", difference);
        }
    }
}
