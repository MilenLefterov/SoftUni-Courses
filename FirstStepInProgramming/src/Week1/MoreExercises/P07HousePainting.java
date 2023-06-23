package Week1.MoreExercises;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        //greenPaint
        double frontWall = (x * x) - (2 * 1.2);
        double backWall = x * x;
        double sideWalls = ((x * y) - (1.5 * 1.5)) * 2;
        double totalWalls = frontWall + backWall + sideWalls;

        double greenPaint = totalWalls / 3.4;

        //redPaint
        double rectangles = (x * y) * 2;
        double triangles = ((x * h) / 2) * 2;
        double totalRoof = rectangles + triangles;

        double redPaint = totalRoof / 4.3;

        System.out.printf("%.2f\n", greenPaint);
        System.out.printf("%.2f", redPaint);

    }
}
