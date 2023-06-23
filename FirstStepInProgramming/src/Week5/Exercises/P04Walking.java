package Week5.Exercises;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalSteps = 0;
        boolean home = false;

        while (totalSteps < 10000) {
            String steps = scan.nextLine();
            if (steps.equals("Going home")) {
                home = true;
                break;
            }
            totalSteps += Integer.parseInt(steps);
        }
        if (home)
            totalSteps += Integer.parseInt(scan.nextLine());

        if (totalSteps >= 10000) {
            System.out.printf("Goal reached! Good job!\n%d steps over the goal!", totalSteps - 10000);
        } else
            System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
    }
}
