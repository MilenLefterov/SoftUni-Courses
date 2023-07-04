package Lectures_Labs.Lecture2;

import java.util.Scanner;

public class P11_RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        double l = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");
        double w = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");
        double h = Double.parseDouble(scanner.nextLine());

        double v = (l * w * h) / 3;

        System.out.printf("Pyramid Volume: %.2f", v);
    }
}
