package Week5.Exercises;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scan.nextLine());
        double ownedMoney = Double.parseDouble(scan.nextLine());
        int dayCounter = 0;
        int spendDayCount = 0;

        while (ownedMoney < neededMoney && spendDayCount < 5) {
            String operation = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());

            if (operation.equals("spend")) {
                ownedMoney -= money;
                if (ownedMoney < 0)
                    ownedMoney = 0;
                spendDayCount++;
            } else {
                ownedMoney += money;
                spendDayCount = 0;
            }
            dayCounter++;
        }

        if (spendDayCount >= 5) {
            System.out.printf("You can't save the money.\n%d", dayCounter);
        } else
            System.out.printf("You saved the money for %d days.", dayCounter);
    }
}
