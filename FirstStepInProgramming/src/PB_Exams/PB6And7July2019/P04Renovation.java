package PB_Exams.PB6And7July2019;

import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = Integer.parseInt(scan.nextLine());
        int w = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());
        String ready = "";

        double area = ((h * w) * 4);
        area = area - ((percent / 100) * area);

        double sum = 0;

        do {
            ready = scan.nextLine();
            if (ready.equals("Tired!")) {
                System.out.printf("%.0f quadratic m left.\n", area);
                break;
            }
            area -= Integer.parseInt(ready);

        } while (area > 0);

        if (area < 0) {
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(area));
        } else if (area == 0)
            System.out.println("All walls are painted! Great job, Pesho!");

    }
}
