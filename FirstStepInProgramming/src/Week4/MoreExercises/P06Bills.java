package Week4.MoreExercises;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mounts = Integer.parseInt(scan.nextLine());

        double electricity = 0;
        double water = 0;
        double internet = 0;
        double other = 0;

        for (int i = 1; i <= mounts; i++) {
            double currentElectricity = Double.parseDouble(scan.nextLine());

            electricity += currentElectricity;
            water += 20;
            internet += 15;
            other += (currentElectricity + 35) * 1.2;
        }

        System.out.printf("Electricity: %.2f lv\n", electricity);
        System.out.printf("Water: %.2f lv\n", water);
        System.out.printf("Internet: %.2f lv\n", internet);
        System.out.printf("Other: %.2f lv\n", other);
        System.out.printf("Average: %.2f lv\n", (electricity + water + internet + other) / mounts);


    }
}
