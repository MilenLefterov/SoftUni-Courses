package PB_Exams.PB15And16June2019;

import java.util.Scanner;

public class P05Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double academyPoints = Double.parseDouble(scan.nextLine());
        int judges = Integer.parseInt(scan.nextLine());
        boolean flag = true;

        for (int i = 1; i <= judges; i++) {
            String nameOfJudge = scan.nextLine();
            double pointsPerJudge = Double.parseDouble(scan.nextLine());

            academyPoints += (nameOfJudge.length() * pointsPerJudge) / 2;

            if (academyPoints >= 1250.5) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.printf("Sorry, %s you need %.1f more!", name, Math.abs(academyPoints - 1250.5));
        } else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, academyPoints);
        }
    }
}
