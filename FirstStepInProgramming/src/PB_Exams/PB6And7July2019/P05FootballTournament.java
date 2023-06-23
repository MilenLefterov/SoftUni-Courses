package PB_Exams.PB6And7July2019;

import java.util.Scanner;

public class P05FootballTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int games = Integer.parseInt(scan.nextLine());
        int totalPoints = 0;

        double countW = 0;
        int countD = 0;
        int countL = 0;

        for (int i = 1; i <= games; i++) {
            String result = scan.nextLine();
            switch (result) {
                case "W":
                    totalPoints += 3;
                    countW++;
                    break;
                case "D":
                    totalPoints += 1;
                    countD++;
                    break;
                case "L":
                    countL++;
                    break;
            }
        }
        if (games == 0)
            System.out.printf("%s hasn't played any games during this season.", name);
        else {
            System.out.printf("%s has won %d points during this season.\n", name, totalPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %.0f\n", countW);
            System.out.printf("## D: %d\n", countD);
            System.out.printf("## L: %d\n", countL);
            System.out.printf("Win rate: %.2f%%\n", (countW * 100) / games);
        }
    }
}
