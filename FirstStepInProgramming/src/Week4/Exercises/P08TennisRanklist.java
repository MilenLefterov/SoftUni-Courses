package Week4.Exercises;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int points = Integer.parseInt(scan.nextLine());

        int pointsFromTournament = 0;
        int w = 0;

        for (int i = 1; i <= n; i++) {

            String rank = scan.nextLine();

            if (rank.equals("W")) {
                pointsFromTournament += 2000;
                w++;
            } else if (rank.equals("F"))
                pointsFromTournament += 1200;
            else if (rank.equals("SF"))
                pointsFromTournament += 720;
        }

        System.out.printf("Final points: %d\n", pointsFromTournament + points);
        System.out.printf("Average points: %d\n", pointsFromTournament / n);
        System.out.printf("%.2f%%\n", (w * 1.0 / n) * 100);


    }
}
