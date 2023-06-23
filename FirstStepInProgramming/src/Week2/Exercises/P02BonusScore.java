package Week2.Exercises;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);

        int points = Integer.parseInt(scan.nextLine());
        double bonus = 0;

        if (points <= 100)
            bonus = 5;
        else if (points < 1000)
            bonus = points * 0.2;
        else
            bonus = points * 0.1;

        //•	Допълнителни бонус точки (начисляват се отделно от предходните):
        if (points % 2 == 0) {
            bonus++;
        } else if (points % 10 == 5) {
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(points + bonus);
    }
}
