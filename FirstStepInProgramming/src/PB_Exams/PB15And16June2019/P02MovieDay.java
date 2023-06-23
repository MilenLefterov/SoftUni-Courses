package PB_Exams.PB15And16June2019;

import java.util.Scanner;

public class P02MovieDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int timeForPictures = Integer.parseInt(scan.nextLine());
        int numberOfScenes = Integer.parseInt(scan.nextLine());
        int durationOfAScene = Integer.parseInt(scan.nextLine());

        double totalTime = (timeForPictures * 0.15) + (numberOfScenes * durationOfAScene);

        if (totalTime <= timeForPictures) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",
                    Math.abs(totalTime - timeForPictures));
        } else
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",
                Math.abs(totalTime - timeForPictures));

    }
}
