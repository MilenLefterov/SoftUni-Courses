package Week2.Exercises;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine());

        min = min + 15;

        if (min > 59) {
            min = min - 60;
            hour++;
        }
        if (hour > 23)
            hour = 0;

        System.out.printf("%d:%02d", hour, min);
    }
}
