package PB_Exams.PB9And10March2019;

import java.util.Scanner;

public class P02FootballResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int win = 0;
        int lose = 0;
        int drawn = 0;

        for (int i = 1; i <= 3; i++) {
            String game = scan.nextLine();

            int myTeamsScore = game.charAt(0);
            int otherTeamsScore = game.charAt(2);

            if (myTeamsScore > otherTeamsScore) {
                win++;
            } else if (myTeamsScore < otherTeamsScore) {
                lose++;
            } else {
                drawn++;
            }

        }

        System.out.printf("Team won %d games.\n", win);
        System.out.printf("Team lost %d games.\n", lose);
        System.out.printf("Drawn games: %d.", drawn);
    }
}
