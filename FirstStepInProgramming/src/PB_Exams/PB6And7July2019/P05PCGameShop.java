package PB_Exams.PB6And7July2019;

import java.util.Scanner;

public class P05PCGameShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int game1 = 0;
        int game2 = 0;
        int game3 = 0;
        int game4 = 0;

        for (int i = 1; i <= n; i++) {
            String name = scan.nextLine();
            switch (name) {
                case "Hearthstone":
                    game1++;
                    break;
                case "Fornite":
                    game2++;
                    break;
                case "Overwatch":
                    game3++;
                    break;
                default:
                    game4++;
                    break;
            }
        }
        System.out.printf("Hearthstone - %.2f%%\n", game1 * 1.0 * 100 / n);
        System.out.printf("Fornite - %.2f%%\n", game2 * 1.0 * 100 / n);
        System.out.printf("Overwatch - %.2f%%\n", game3 * 1.0 * 100 / n);
        System.out.printf("Others - %.2f%%\n", game4 * 1.0 * 100 / n);
    }
}
