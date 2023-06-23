package Week2.Exercises;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String serialName = scan.nextLine();
        int episodeDuration = Integer.parseInt(scan.nextLine());
        int durationOfTheLunchBreak = Integer.parseInt(scan.nextLine());

        Double timeToEat = durationOfTheLunchBreak * 0.125;
        Double timeToRest = durationOfTheLunchBreak * 0.25;

        Double totalTime = durationOfTheLunchBreak - timeToEat - timeToRest;

        if (totalTime >= episodeDuration)
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    serialName, Math.ceil(totalTime - episodeDuration));
        else
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    serialName, Math.ceil(episodeDuration - totalTime));
    }
}
