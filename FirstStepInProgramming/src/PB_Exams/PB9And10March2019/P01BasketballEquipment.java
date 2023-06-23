package PB_Exams.PB9And10March2019;

import java.util.Scanner;

public class P01BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tax = Integer.parseInt(scan.nextLine());

        double sneakers = tax * 0.6;
        double outfit = sneakers * 0.8;
        double ball = outfit * 0.25;
        double accessories = ball * 0.20;

        System.out.printf("%.2f", tax + sneakers + outfit + ball + accessories);
    }
}
