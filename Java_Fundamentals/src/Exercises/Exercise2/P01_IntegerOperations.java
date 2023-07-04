package Exercises.Exercise2;

import java.util.Scanner;

public class P01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstN = Integer.parseInt(scan.nextLine());
        int secondN = Integer.parseInt(scan.nextLine());
        int thirdN = Integer.parseInt(scan.nextLine());
        int fourthN = Integer.parseInt(scan.nextLine());

        System.out.println(((firstN + secondN) / thirdN) * fourthN);

    }
}
