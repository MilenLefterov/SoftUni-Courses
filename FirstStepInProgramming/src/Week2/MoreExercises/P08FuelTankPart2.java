package Week2.MoreExercises;

import java.util.Scanner;

public class P08FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fuel = scan.nextLine();
        double l = Double.parseDouble(scan.nextLine());
        String card = scan.nextLine();

        double sum = 0;

        if (card.equals("Yes")) {
            if (fuel.equals("Gas"))
                sum = (0.93 - 0.08) * l;
            else if (fuel.equals("Gasoline"))
                sum = (2.22 - 0.18) * l;
            else if (fuel.equals("Diesel"))
                sum = (2.33 - 0.12) * l;
        } else if (fuel.equals("Gas"))
            sum = 0.93 * l;
        else if (fuel.equals("Gasoline"))
            sum = 2.22 * l;
        else if (fuel.equals("Diesel"))
            sum = 2.33 * l;

        if (l >= 20 && l <= 25)
            sum = sum * 0.92;
        else if (l > 25)
            sum = sum * 0.90;

        System.out.printf("%.2f lv.", sum);


    }
}
