package Exercises.Exercise1;

import java.util.Scanner;

public class P10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scan.nextLine());
        int countOfStudents = Integer.parseInt(scan.nextLine());
        double priceOfLightsabers = Double.parseDouble(scan.nextLine());
        double priceOfRobes = Double.parseDouble(scan.nextLine());
        double priceOfBelts = Double.parseDouble(scan.nextLine());

        double total = 0.00;

        total += Math.ceil(countOfStudents * 1.10) * priceOfLightsabers;
        total += Math.ceil(countOfStudents - (countOfStudents / 6.00)) * priceOfBelts;
        total += countOfStudents * priceOfRobes;

        if (total <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(amountOfMoney - total));
        }
    }
}
