package Week4.Exercises;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String actorName = scan.nextLine();
        double pointsFromAcademy = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        double totalPoints = pointsFromAcademy;

        for (int i = 1; i <= n; i++) {
            String judgeName = scan.nextLine();
            double judgePoints = Double.parseDouble(scan.nextLine());

            totalPoints += (judgeName.length() * judgePoints) / 2;

            if (totalPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                break;
            }
        }

        if (totalPoints < 1250.5)
            System.out.printf("Sorry, %s you need %.1f more!",actorName, Math.abs(1250.5 - totalPoints));

    }
}
