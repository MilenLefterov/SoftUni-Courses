package Week1.Exercises;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            •	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
            •	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
            •	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
            •	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        */

        int tax = Integer.parseInt(scan.nextLine());

        double priceOfShoes = tax * 0.6;
        double priceOfSuit = priceOfShoes * 0.8;
        double priceOfBall = priceOfSuit * 0.25;
        double priceOfAccessories = priceOfBall * 0.2;

        // обща цена:
        System.out.println(priceOfShoes + priceOfSuit + priceOfBall + priceOfAccessories + tax);

    }
}
