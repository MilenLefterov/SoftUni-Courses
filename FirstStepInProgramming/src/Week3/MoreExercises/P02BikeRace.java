package Week3.MoreExercises;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfJuniorCyclists = Integer.parseInt(scan.nextLine());
        int numberOfSeniorCyclists = Integer.parseInt(scan.nextLine());
        String trackType = scan.nextLine();
        double sum = 0;

        if (trackType.equals("trail")) {
            sum = numberOfJuniorCyclists * 5.50;
            sum = sum + numberOfSeniorCyclists * 7;
        } else if (trackType.equals("cross-country")) {
            if (numberOfJuniorCyclists + numberOfSeniorCyclists >= 50) {
                sum = (numberOfJuniorCyclists * 8) * 0.75;
                sum = sum + ((numberOfSeniorCyclists * 9.50) * 0.75);
            }
            else {
                sum = numberOfJuniorCyclists * 8;
                sum = sum + numberOfSeniorCyclists * 9.50;
            }
        } else if (trackType.equals("downhill")) {
            sum = numberOfJuniorCyclists * 12.25;
            sum = sum + numberOfSeniorCyclists * 13.75;
        }
        else if (trackType.equals("road")){
            sum = numberOfJuniorCyclists * 20;
            sum = sum + numberOfSeniorCyclists * 21.50;
        }

        sum = sum * 0.95; //5% процента от събраната сума за разходи
        System.out.printf("%.2f", sum);
    }
}
