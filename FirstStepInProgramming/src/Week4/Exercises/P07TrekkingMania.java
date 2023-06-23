package Week4.Exercises;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int Musalla = 0;
        int MontBlanc = 0;
        int Kilimanjaro = 0;
        int K2 = 0;
        int Everest = 0;

        int peoples =0;

        for (int i = 1; i <= n; i++) {
            int group = Integer.parseInt(scan.nextLine());

            peoples += group;

            if (group < 6)
                Musalla += group;
            else if (group < 13)
                MontBlanc += group;
            else if (group < 26)
                Kilimanjaro += group;
            else if (group < 41)
                K2 += group;
            else
                Everest += group;

        }

        System.out.printf("%.2f%%\n", ((Musalla * 1.0) / peoples) * 100);
        System.out.printf("%.2f%%\n", ((MontBlanc * 1.0) / peoples) * 100);
        System.out.printf("%.2f%%\n", ((Kilimanjaro * 1.0) / peoples) * 100);
        System.out.printf("%.2f%%\n", ((K2 * 1.0) / peoples) * 100);
        System.out.printf("%.2f%%\n", ((Everest * 1.0) / peoples) * 100);

    }
}
