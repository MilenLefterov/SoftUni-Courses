package Exercises.Exercise2;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());// number of lines
        int tankCapacity = 255;

        int newWater = 0;
        for (int i = 0; i < n; i++) {
            int currentQuantity = Integer.parseInt(scan.nextLine());

            if (currentQuantity <= (tankCapacity - newWater)) {
                newWater += currentQuantity;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }

        System.out.println(newWater);
    }
}
