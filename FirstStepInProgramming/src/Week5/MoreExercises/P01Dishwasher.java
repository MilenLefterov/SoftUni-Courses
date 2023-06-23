package Week5.MoreExercises;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int DishwashingDetergent = Integer.parseInt(scan.nextLine()) * 750;//препарат в мл.
        String input = scan.nextLine();
        int i = 0;
        int dishes = 0;
        int pots = 0;

        while (!input.equals("End") && DishwashingDetergent >= 0) {
            if (!input.equals("0")) {
                i++;
                int quantity = Integer.parseInt(input);
                if (i % 3 == 0) {
                    DishwashingDetergent -= quantity * 15;
                    pots += quantity;
                } else {
                    DishwashingDetergent -= quantity * 5;
                    dishes += quantity;
                }
            }
            if (DishwashingDetergent >= 0)
                input = scan.nextLine();

        }
        if (DishwashingDetergent >= 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n", dishes, pots);
            System.out.printf("Leftover detergent %d ml.", DishwashingDetergent);
        } else
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(DishwashingDetergent));

    }
}
