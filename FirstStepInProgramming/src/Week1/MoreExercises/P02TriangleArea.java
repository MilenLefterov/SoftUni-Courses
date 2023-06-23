package Week1.MoreExercises;

import java.util.Scanner;

public class P02TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            Напишете програма, която чете от конзолата страна и височина на триъгълник и пресмята неговото лице.
            Използвайте формулата за лице на триъгълник: area = a * h / 2.
            Форматирате изхода до втория знак след десетичната запетая.

        */

        double a = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        //лицето на триъгълника:
        double tArea = a * h / 2;

        System.out.printf("%.2f", tArea);

    }
}
