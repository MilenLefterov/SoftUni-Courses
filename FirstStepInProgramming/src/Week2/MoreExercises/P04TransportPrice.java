package Week2.MoreExercises;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine()); //километри
        String timeOfTheDay = scan.nextLine();

        if (n >= 100)
            System.out.printf("%.2f", 0.06 * n);
        else if (n >= 20)
            System.out.printf("%.2f", 0.09 * n);
        else if (timeOfTheDay.equals("day"))
            System.out.printf("%.2f", 0.7 + 0.79 * n);
        else
            System.out.printf("%.2f", 0.7 + 0.90 * n);
    }
}
