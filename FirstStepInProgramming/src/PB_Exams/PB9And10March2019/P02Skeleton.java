package PB_Exams.PB9And10March2019;

import java.util.Scanner;

public class P02Skeleton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = Integer.parseInt(scan.nextLine());
        int sek = Integer.parseInt(scan.nextLine());
        double chute = Double.parseDouble(scan.nextLine());
        int sekFor100m = Integer.parseInt(scan.nextLine());

        int controlInSeconds = min * 60 + sek;
        double totalReducedTime = (chute / 120) * 2.5;
        double totalTime = (chute / 100) * sekFor100m - totalReducedTime;


        if (totalTime <= controlInSeconds) {
            System.out.printf("Marin Bangiev won an Olympic quota!\nHis time is %.3f.", totalTime);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", Math.abs(totalTime - controlInSeconds));
        }
    }
}
