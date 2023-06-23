package Week1.MoreExercises;

import java.util.Scanner;

public class P08CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r = Double.parseDouble(scan.nextLine());


        System.out.printf("%.2f\n", Math.PI * r *r);
        System.out.printf("%.2f", 2 * Math.PI * r);

    }
}
