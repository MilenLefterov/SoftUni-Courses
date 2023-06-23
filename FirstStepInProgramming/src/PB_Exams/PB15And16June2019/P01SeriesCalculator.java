package PB_Exams.PB15And16June2019;

import java.util.Scanner;

public class P01SeriesCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String seriesName = scan.nextLine();
        int seasons = Integer.parseInt(scan.nextLine());
        int episodes = Integer.parseInt(scan.nextLine());
        double episodeLength= Double.parseDouble(scan.nextLine());

        episodeLength *= 1.2;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",
                seriesName, (episodes * episodeLength) * seasons + (seasons * 10));

    }
}
