package Week2.MoreExercises;

import java.util.Scanner;

public class P07FuelTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fuel = scan.nextLine();
        double l = Double.parseDouble(scan.nextLine());

        switch (fuel) {
            case "Diesel":
            case "Gasoline":
            case "Gas":
                if (l >= 25)
                    System.out.printf("You have enough %s.", fuel.toLowerCase());
                else
                    System.out.printf("Fill your tank with %s!", fuel.toLowerCase());
                break;
            default:
                System.out.println("Invalid fuel!");
                break;
        }
    }
}
