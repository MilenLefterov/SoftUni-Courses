package Week2.MoreExercises;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfDaysOff = Integer.parseInt(scan.nextLine());

        int norm = 30000;
        int numberOfWorkingDays = 365 - numberOfDaysOff;
        int playtime = numberOfWorkingDays * 63 + numberOfDaysOff * 127;

        if (playtime > norm)
            System.out.printf("Tom will run away\n%d hours and %d minutes more for play", (playtime - norm) / 60, (playtime - norm) % 60);
        else
            System.out.printf("Tom sleeps well\n%d hours and %d minutes less for play", (norm - playtime) / 60, (norm - playtime) % 60);
    }
}
