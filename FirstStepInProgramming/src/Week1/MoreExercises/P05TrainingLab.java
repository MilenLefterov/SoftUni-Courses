package Week1.MoreExercises;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double lengthОfHall = w * 100;
        double widthOfHall = h * 100 - 100; // 100см за коридора

        double desksInARow = Math.floor( widthOfHall / 70);
        double rows = Math.floor(lengthОfHall / 120);

        double totalDesks = desksInARow * rows - 3;

        System.out.printf("%.0f", totalDesks);


    }
}
