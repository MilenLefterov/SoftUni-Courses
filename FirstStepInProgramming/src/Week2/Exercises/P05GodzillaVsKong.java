package Week2.Exercises;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        /*
        От конзолата се четат 3 реда:
            Ред 1.	Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
            Ред 2.	Брой на статистите – цяло число в интервала [1 … 500]
            Ред 3.	Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]
        */

        double budget = Double.parseDouble(scan.nextLine());
        int numberОfStatistics = Integer.parseInt(scan.nextLine());
        double priceОfSuit = Double.parseDouble(scan.nextLine());

       /*
       Известно е, че:
            •	Декорът за филма е на стойност 10% от бюджета.
            •	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.
        */
        double decor = budget * 0.1;
        if(numberОfStatistics > 150)
            priceОfSuit = priceОfSuit * 0.9;

        /*
        На конзолата трябва да се отпечатат два реда:
            •	Ако  парите за декора и дрехите са повече от бюджета:
                o	"Not enough money!"
                o	"Wingard needs {парите недостигащи за филма} leva more."
            •	Ако парите за декора и дрехите са по малко или равни на бюджета:
                o	"Action!"
                o	"Wingard starts filming with {останалите пари} leva left."
        Резултатът трябва да е форматиран до втория знак след десетичната запетая.
        */
        Double total = decor + priceОfSuit * numberОfStatistics;
        if(total > budget)
        {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", total - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - total);
        }
    }
}
