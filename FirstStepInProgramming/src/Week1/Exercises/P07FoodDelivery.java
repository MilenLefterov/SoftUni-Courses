package Week1.Exercises;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            • Chicken menu – BGN 10.35.
            • Fish menu – BGN 12.40.
            • Vegetarian menu – BGN 8.15.
        */

        int chickenMenus = Integer.parseInt(scan.nextLine());
        int fishMenus = Integer.parseInt(scan.nextLine());
        int vegetarianMenus = Integer.parseInt(scan.nextLine());

        double priceOfChickenMenus = chickenMenus * 10.35;
        double priceOfFishMenus = fishMenus * 12.40;
        double priceOfVegetarianMenus = vegetarianMenus * 8.15;
        // обща цена:
        double totalPriceWithDessert = (priceOfChickenMenus + priceOfFishMenus + priceOfVegetarianMenus) * 1.2;
        //Общата сума с доставка:
        System.out.println(totalPriceWithDessert + 2.50);

    }
}
