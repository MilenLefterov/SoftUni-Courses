package Exercises.Exercise3;

import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wagons = Integer.parseInt(scan.nextLine());
        int[] train = new int[wagons];

        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scan.nextLine());
        }

        int sumOfPeople = 0;
        for (int i : train) {
            System.out.print(i + " ");
            sumOfPeople += i;
        }
        System.out.println("\n" + sumOfPeople);
    }
}
