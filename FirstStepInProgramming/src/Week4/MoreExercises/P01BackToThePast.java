package Week4.MoreExercises;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double inheritance = Double.parseDouble(scan.nextLine());
        int yar = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= yar - 1799; i++) {
            if (i % 2 == 0)
                inheritance -= 12000 + (50 * (i + 17));
            else
                inheritance -= 12000;
        }

        if (inheritance >= 0)
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", Math.abs(inheritance));
        else
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(inheritance));
    }
}
