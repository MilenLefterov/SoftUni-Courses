package Week2.Lecture2_Exercises;

import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String geometricShape = scan.nextLine();

        if (geometricShape.equals("square")) {
            Double a = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f", a * a);
        } else if (geometricShape.equals("rectangle")) {
            Double a = Double.parseDouble(scan.nextLine());
            Double b = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f", a * b);
        } else if (geometricShape.equals("circle")) {
            Double r = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f", Math.PI * r * r);
        } else if (geometricShape.equals("triangle")) {
            Double a = Double.parseDouble(scan.nextLine());
            Double ha = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f", (a * ha) / 2);

        }


    }
}
