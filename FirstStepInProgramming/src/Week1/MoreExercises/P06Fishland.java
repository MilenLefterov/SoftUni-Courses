package Week1.MoreExercises;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Георги ще има гости вечерта и решава да ги нагости с паламуд, сафрид и миди.
        Затова отива на рибната борса, за да си купи по няколко килограма.
        Oт конзолата се въвеждат цените в лева на скумрията и цацата.
        Също количеството на паламуд, сафрид и миди в килограми.
        Колко пари ще са му необходими, за да плати сметката си, ако цените на борсата са:

            •	Паламуд – 60% по-скъп от скумрията
            •	Сафрид – 80% по-скъп от цацата
            •	Миди – 7.50 лв. за килограм
    */

        double priceForKgOfMackerel = Double.parseDouble(scan.nextLine());
        double priceForKgSprinkle = Double.parseDouble(scan.nextLine());
        double kgOfBonito = Double.parseDouble(scan.nextLine());
        double kgOfSafrid = Double.parseDouble(scan.nextLine());
        int kgOfMussels = Integer.parseInt(scan.nextLine());

        double priceOfBonito = kgOfBonito * (priceForKgOfMackerel * 1.6);
        double priceFOfSafrid = kgOfSafrid * (priceForKgSprinkle * 1.8);
        double priceForMussels = kgOfMussels * 7.50;
        double sum = priceOfBonito + priceFOfSafrid + priceForMussels;

        System.out.printf("%.2f", sum);

    }

}
