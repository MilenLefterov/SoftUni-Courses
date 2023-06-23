package PB_Exams.PB6And7July2019;

import java.util.Scanner;

public class P03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String drink = scan.nextLine();
        String sugar = scan.nextLine();
        int numberOfDrinks = Integer.parseInt(scan.nextLine());

        double sum = 0;

        switch (drink) {
            case "Espresso":
                if (sugar.equals("Without"))
                    sum += (numberOfDrinks * 0.9) * 0.65;
                else if (sugar.equals("Normal"))
                    sum += (numberOfDrinks * 1.0);
                else
                    sum += (numberOfDrinks * 1.2);

                if (numberOfDrinks >= 5)
                    sum *= 0.75;
                break;
            case "Cappuccino":
                if (sugar.equals("Without"))
                    sum += (numberOfDrinks * 1.0) * 0.65;
                else if (sugar.equals("Normal"))
                    sum += (numberOfDrinks * 1.2);
                else
                    sum += (numberOfDrinks * 1.6);
                break;
            case "Tea":
                if (sugar.equals("Without"))
                    sum += (numberOfDrinks * 0.5) * 0.65;
                else if (sugar.equals("Normal"))
                    sum += (numberOfDrinks * 0.6);
                else
                    sum += (numberOfDrinks * 0.7);
                break;
        }
        if (sum > 15)
            sum *= 0.8;

        System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, drink, sum);

    }
}
