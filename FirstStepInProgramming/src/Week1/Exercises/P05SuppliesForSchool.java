package Week1.Exercises;

import java.util.Scanner;

public class P05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int packagesOfChemicals = Integer.parseInt(scan.nextLine());
        int packagesOfHighlighter = Integer.parseInt(scan.nextLine());
        int cleaningAgent = Integer.parseInt(scan.nextLine());
        int Percent = Integer.parseInt(scan.nextLine());

        double priceOfChemicals = packagesOfChemicals * 5.80;
        double priceOfHighlighter = packagesOfHighlighter * 7.20;
        double priceOfCleaningAgent = cleaningAgent * 1.2;
        double sum = priceOfChemicals + priceOfHighlighter + priceOfCleaningAgent;

        System.out.println(sum - (sum * Percent * 0.01));


    }
}
