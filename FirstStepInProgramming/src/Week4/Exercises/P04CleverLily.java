package Week4.Exercises;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double washingMachine = Double.parseDouble(scan.nextLine());
        int pricePerToy = Integer.parseInt(scan.nextLine());

        double sum = 0;

        for (int i = 1; i <= age/2; i++)
            sum = sum + (i * 10) - 1;

        sum = sum + (pricePerToy * Math.ceil(age * 1.0 / 2));

        if( sum >= washingMachine)
            System.out.printf("Yes! %.2f\n", Math.abs(sum - washingMachine));
        else
            System.out.printf("No! %.2f\n", Math.abs(sum - washingMachine));
    }
}
