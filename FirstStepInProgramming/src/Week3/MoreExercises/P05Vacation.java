package Week3.MoreExercises;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        double km = Double.parseDouble(scan.nextLine());

        double salary = 0;

        if (km <= 5000)
            if (season.equals("Summer"))
                salary = km * 0.90;
            else if (season.equals("Winter"))
                salary = km * 1.05;
            else
                salary = km * 0.75;
        else if (km <= 10000)
            if (season.equals("Summer"))
                salary = km * 1.10;
            else if (season.equals("Winter"))
                salary = km * 1.25;
            else
                salary = km * 0.95;
         else
            salary = km * 1.45;

        System.out.printf("%.2f", salary * 4 * 0.90);

    }
}
