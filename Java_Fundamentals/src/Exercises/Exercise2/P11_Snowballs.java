package Exercises.Exercise2;

import java.util.Scanner;

public class P11_Snowballs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double bestSnowball = 0;
        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;
        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());

            //(snowballSnow / snowballTime) ^ snowballQuality
            double snowballValue = Math.pow((double) (snowballSnow / snowballTime), snowballQuality);

            if (snowballValue >= bestSnowball) {
                bestSnowball = snowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }
        }
        if (n != 0) {
            System.out.printf("%d : %d = %.0f (%d)", bestSnowballSnow, bestSnowballTime, bestSnowball, bestSnowballQuality);
        }
    }
}
