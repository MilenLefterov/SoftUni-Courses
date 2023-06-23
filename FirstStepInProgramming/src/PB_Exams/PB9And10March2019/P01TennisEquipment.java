package PB_Exams.PB9And10March2019;

import java.util.Scanner;

public class P01TennisEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceOfTennisRacket = Double.parseDouble(scan.nextLine());
        int numberOfTennisRackets = Integer.parseInt(scan.nextLine());
        int numberOfPairsOfSneakers = Integer.parseInt(scan.nextLine());

        double sumOfTennisRackets = priceOfTennisRacket * numberOfTennisRackets;
        double sumOfPairsOfSneakers = (priceOfTennisRacket / 6) * numberOfPairsOfSneakers;
        double sumOfOtherEquipment = (sumOfPairsOfSneakers + sumOfTennisRackets) * 0.2;

        Double totalSum = sumOfTennisRackets + sumOfPairsOfSneakers + sumOfOtherEquipment;

        System.out.printf("Price to be paid by Djokovic %.0f\n", Math.floor(totalSum / 8));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(totalSum * 7 / 8));


    }
}
