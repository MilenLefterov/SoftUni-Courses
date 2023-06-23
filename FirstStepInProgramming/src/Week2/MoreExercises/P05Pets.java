package Week2.MoreExercises;

import java.util.Scanner;

public class P05Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int foodLeftBehind = Integer.parseInt(scan.nextLine());
        double foodPerDayForTheDog = Double.parseDouble(scan.nextLine());
        double foodPerDayForTheCat = Double.parseDouble(scan.nextLine());
        double foodPerDayForTheTurtle = Double.parseDouble(scan.nextLine());

        double food = days * foodPerDayForTheDog +
                days * foodPerDayForTheCat +
                days * (foodPerDayForTheTurtle / 1000);

        if (foodLeftBehind >= food)
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeftBehind - food));
        else
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(food - foodLeftBehind));


    }
}
