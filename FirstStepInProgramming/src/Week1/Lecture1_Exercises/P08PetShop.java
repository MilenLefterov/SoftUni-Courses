package Week1.Lecture1_Exercises;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogFood = Integer.parseInt(scan.nextLine());
        int catFood = Integer.parseInt(scan.nextLine());
        System.out.println((dogFood * 2.50) + (catFood * 4 * 1.0) + " lv.");

    }
}
