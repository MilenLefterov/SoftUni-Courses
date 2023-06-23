package Week2.Exercises;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);

/*
        От конзолата се четат 6 реда:
        1.	Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        2.	Брой пъзели - цяло число в интервала [0… 1000]
        3.	Брой говорещи кукли - цяло число в интервала [0 … 1000]
        4.	Брой плюшени мечета - цяло число в интервала [0 … 1000]
        5.	Брой миньони - цяло число в интервала [0 … 1000]
        6.	Брой камиончета - цяло число в интервала [0 … 1000]
*/

        double priceOfTheExcursion = Double.parseDouble(scan.nextLine());
        int numberOfPuzzles = Integer.parseInt(scan.nextLine());
        int numberOfTalkingDolls = Integer.parseInt(scan.nextLine());
        int numberOfTeddyBears = Integer.parseInt(scan.nextLine());
        int numberOfMinions = Integer.parseInt(scan.nextLine());
        int numberOfTrucks = Integer.parseInt(scan.nextLine());

/*
        Цени на играчките:
            •Пъзел - 2.60 лв.
            •Говореща кукла -3 лв.
            •Плюшено мече -4.10 лв.
            •Миньон - 8.20 лв.
            •Камионче - 2 лв.
*/
        double sum = numberOfPuzzles * 2.60 +
                numberOfTalkingDolls * 3 +
                numberOfTeddyBears * 4.10 +
                numberOfMinions * 8.2 +
                numberOfTrucks * 2;

        int orders = numberOfPuzzles +
                numberOfTalkingDolls +
                numberOfTeddyBears +
                numberOfMinions +
                numberOfTrucks;

        // Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
        // От спечелените пари Петя трябва да даде 10% за наема на магазина.
        // Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.

        if (orders >= 50) {
            sum = sum * 0.75;
        }

        sum = sum * 0.9; //rent 10%
/*
        На конзолата се отпечатва:
            •	Ако парите са достатъчни се отпечатва:
                -	"Yes! {оставащите пари} lv left."
            •	Ако парите НЕ са достатъчни се отпечатва:
                -	"Not enough money! {недостигащите пари} lv needed."
*/
        if (sum >= priceOfTheExcursion)
            System.out.printf("Yes! %.2f lv left.", sum - priceOfTheExcursion);
        else
            System.out.printf("Not enough money! %.2f lv needed.", priceOfTheExcursion - sum);
    }
}
